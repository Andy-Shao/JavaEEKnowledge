//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.13 at 06:13:14 PM CDT 
//

package restful2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "" , propOrder = {
    "subTotal" , "savedForLaterItem"
})
@XmlRootElement(name = "SavedForLaterItems")
public class SavedForLaterItems {

    @XmlElement(name = "SavedForLaterItem" , required = true)
    protected List<CartItem> savedForLaterItem;
    @XmlElement(name = "SubTotal")
    protected Price subTotal;

    
    public List<CartItem> getSavedForLaterItem() {
        if (this.savedForLaterItem == null) this.savedForLaterItem = new ArrayList<CartItem>();
        return this.savedForLaterItem;
    }

    
    public Price getSubTotal() {
        return this.subTotal;
    }

    
    public void setSubTotal(Price value) {
        this.subTotal = value;
    }

}
