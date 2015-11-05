package clientBase64;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getImageResponse" , propOrder = { "_return" })
public class GetImageResponse {

    @XmlElement(name = "return")
    protected byte[] _return;

    public byte[] getReturn() {
        return this._return;
    }

    public void setReturn(byte[] value) {
        this._return = (value);
    }

}
