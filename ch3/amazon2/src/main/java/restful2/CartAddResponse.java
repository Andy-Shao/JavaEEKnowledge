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
    "operationRequest" , "cart"
})
@XmlRootElement(name = "CartAddResponse")
public class CartAddResponse {

    @XmlElement(name = "Cart")
    protected List<Cart> cart;
    @XmlElement(name = "OperationRequest")
    protected OperationRequest operationRequest;

    
    public List<Cart> getCart() {
        if (this.cart == null) this.cart = new ArrayList<Cart>();
        return this.cart;
    }

    
    public OperationRequest getOperationRequest() {
        return this.operationRequest;
    }

    
    public void setOperationRequest(OperationRequest value) {
        this.operationRequest = value;
    }

}
