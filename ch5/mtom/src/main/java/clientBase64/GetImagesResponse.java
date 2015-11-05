package clientBase64;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getImagesResponse" , propOrder = { "_return" })
public class GetImagesResponse {

    @XmlElement(name = "return")
    protected List<byte[]> _return;

    public List<byte[]> getReturn() {
        if (this._return == null) this._return = new ArrayList<byte[]>();
        return this._return;
    }

}
