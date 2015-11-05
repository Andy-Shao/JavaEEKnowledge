package clientMTOM;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getImageResponse" , propOrder = { "_return" })
public class GetImageResponse {

    @XmlElement(name = "return")
    @XmlMimeType("application/octet-stream")
    protected DataHandler _return;

    public DataHandler getReturn() {
        return this._return;
    }

    public void setReturn(DataHandler value) {
        this._return = value;
    }

}
