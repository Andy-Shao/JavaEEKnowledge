package clientAsync;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nextN" , propOrder = {
    "arg0"
})
public class NextN {

    protected int arg0;

    
    public int getArg0() {
        return this.arg0;
    }

    
    public void setArg0(int value) {
        this.arg0 = value;
    }

}
