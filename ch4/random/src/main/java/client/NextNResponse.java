package client;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nextNResponse" , propOrder = {
    "_return"
})
public class NextNResponse {

    @XmlElement(name = "return" , type = Integer.class)
    protected List<Integer> _return;

    
    public List<Integer> getReturn() {
        if (this._return == null) this._return = new ArrayList<Integer>();
        return this._return;
    }

}
