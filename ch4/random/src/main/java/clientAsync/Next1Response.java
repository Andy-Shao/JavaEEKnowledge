package clientAsync;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "next1Response" , propOrder = {
    "_return"
})
public class Next1Response {

    @XmlElement(name = "return")
    protected int _return;

    
    public int getReturn() {
        return this._return;
    }

    
    public void setReturn(int value) {
        this._return = value;
    }

}
