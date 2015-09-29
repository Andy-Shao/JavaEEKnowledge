//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.13 at 06:13:14 PM CDT 
//

package restful2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartModifyRequest" , propOrder = {
    "cartId" , "hmac" , "mergeCart" , "items" , "responseGroup"
})
public class CartModifyRequest {

    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "" , propOrder = {
        "item"
    })
    public static class Items {

        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "" , propOrder = {
            "action" , "cartItemId" , "quantity"
        })
        public static class Item {

            @XmlElement(name = "Action")
            protected String action;
            @XmlElement(name = "CartItemId")
            protected String cartItemId;
            @XmlElement(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;

            
            public String getAction() {
                return this.action;
            }

            
            public String getCartItemId() {
                return this.cartItemId;
            }

            
            public BigInteger getQuantity() {
                return this.quantity;
            }

            
            public void setAction(String value) {
                this.action = value;
            }

            
            public void setCartItemId(String value) {
                this.cartItemId = value;
            }

            
            public void setQuantity(BigInteger value) {
                this.quantity = value;
            }

        }

        @XmlElement(name = "Item")
        protected List<CartModifyRequest.Items.Item> item;

        
        public List<CartModifyRequest.Items.Item> getItem() {
            if (this.item == null) this.item = new ArrayList<CartModifyRequest.Items.Item>();
            return this.item;
        }

    }

    @XmlElement(name = "CartId")
    protected String cartId;
    @XmlElement(name = "HMAC")
    protected String hmac;
    @XmlElement(name = "Items")
    protected CartModifyRequest.Items items;
    @XmlElement(name = "MergeCart")
    protected String mergeCart;

    @XmlElement(name = "ResponseGroup")
    protected List<String> responseGroup;

    
    public String getCartId() {
        return this.cartId;
    }

    
    public String getHMAC() {
        return this.hmac;
    }

    
    public CartModifyRequest.Items getItems() {
        return this.items;
    }

    
    public String getMergeCart() {
        return this.mergeCart;
    }

    
    public List<String> getResponseGroup() {
        if (this.responseGroup == null) this.responseGroup = new ArrayList<String>();
        return this.responseGroup;
    }

    
    public void setCartId(String value) {
        this.cartId = value;
    }

    
    public void setHMAC(String value) {
        this.hmac = value;
    }

    
    public void setItems(CartModifyRequest.Items value) {
        this.items = value;
    }

    
    public void setMergeCart(String value) {
        this.mergeCart = value;
    }

}
