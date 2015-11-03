package clientSOAP;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllResponse" , propOrder = { "_return" })
public class GetAllResponse {

    @XmlElement(name = "return")
    protected List<Prediction> _return;

    public List<Prediction> getReturn() {
        if (this._return == null) this._return = new ArrayList<Prediction>();
        return this._return;
    }

}
