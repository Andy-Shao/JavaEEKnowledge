package clientSOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOneResponse" , propOrder = { "_return" })
public class GetOneResponse {

    @XmlElement(name = "return")
    protected Prediction _return;

    public Prediction getReturn() {
        return this._return;
    }

    public void setReturn(Prediction value) {
        this._return = value;
    }

}
