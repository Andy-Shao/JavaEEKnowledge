package clientMTOM;

import java.util.ArrayList;
import java.util.List;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getImagesResponse" , propOrder = { "_return" })
public class GetImagesResponse {

    @XmlElement(name = "return")
    @XmlMimeType("application/octet-stream")
    protected List<DataHandler> _return;

    public List<DataHandler> getReturn() {
        if (this._return == null) this._return = new ArrayList<DataHandler>();
        return this._return;
    }

}
