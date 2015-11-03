package clientSOAP;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;
import java.util.TimeZone;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.commons.codec.binary.Base64;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

class ClientHashHandler implements SOAPHandler<SOAPMessageContext> {
    private String name;
    private byte[] secretBytes;

    public ClientHashHandler(String name , String key) {
        this.name = name;
        this.secretBytes = this.getBytes(key);
    }

    private void append(Node node , String elementName , String elementText) {
        Element element = node.getOwnerDocument().createElement(elementName);
        element.setTextContent(elementText);
        node.appendChild(element);
    }

    @Override
    public void close(MessageContext context) {
    }

    private byte[] getBytes(String key) {
        try {
            return key.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    private String getSignature(String name , String timeStamp , byte[] secretBytes) {
        try {
            System.out.println("Name == " + name);
            System.out.println("TimeStamp == " + timeStamp);
            String toSign = name + timeStamp;
            byte[] toSignBytes = this.getBytes(toSign);
            Mac signer = Mac.getInstance("HmacSHA256");
            SecretKeySpec keySpec = new SecretKeySpec(secretBytes , "HmacSHA256");
            signer.init(keySpec);
            signer.update(toSignBytes);
            byte[] signBytes = signer.doFinal();
            String signature = new String(Base64.encodeBase64(signBytes));
            return signature;
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new RuntimeException("NoSuchAlgorithmException thrown" , e);
        }
    }

    private String getTimStamp() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateFormat.format(calendar.getTime());
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        SOAPMessage msg = context.getMessage();
        try {
            msg.writeTo(System.err);
        } catch (SOAPException | IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outbound) try {
            SOAPMessage soapMessage = context.getMessage();
            SOAPEnvelope envelope = soapMessage.getSOAPPart().getEnvelope();
            //确保存在一个标头并添加一个"包装器"元素
            if (envelope.getHeader() == null) envelope.addHeader();
            SOAPHeader header = envelope.getHeader();
            header.addHeaderElement(new QName("http://predictionsSOAP" , "credentials"));
            //现在在标头中插入证书
            String timeStamp = this.getTimStamp();
            String signature = this.getSignature(this.name , timeStamp , this.secretBytes);
            Node firstChild = header.getFirstChild();
            this.append(firstChild , "Name" , this.name);
            this.append(firstChild , "Signature" , signature);
            this.append(firstChild , "Timestamp" , timeStamp);
        } catch (SOAPException e) {
            throw new RuntimeException("SOAPException thrown." , e);
        }
        return true;
    }

}
