package predictions.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "editResponse" , namespace = "http://predictions/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editResponse" , namespace = "http://predictions/")
public class EditResponse {

    @XmlElement(name = "return" , namespace = "")
    private String _return;

    
    public String getReturn() {
        return this._return;
    }

    
    public void setReturn(String _return) {
        this._return = _return;
    }

}
