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
    "otherCategoriesSimilarProduct"
})
@XmlRootElement(name = "OtherCategoriesSimilarProducts")
public class OtherCategoriesSimilarProducts {

    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "" , propOrder = {
        "asin" , "title"
    })
    public static class OtherCategoriesSimilarProduct {

        @XmlElement(name = "ASIN")
        protected String asin;
        @XmlElement(name = "Title")
        protected String title;

        
        public String getASIN() {
            return this.asin;
        }

        
        public String getTitle() {
            return this.title;
        }

        
        public void setASIN(String value) {
            this.asin = value;
        }

        
        public void setTitle(String value) {
            this.title = value;
        }

    }

    @XmlElement(name = "OtherCategoriesSimilarProduct" , required = true)
    protected List<OtherCategoriesSimilarProducts.OtherCategoriesSimilarProduct> otherCategoriesSimilarProduct;

    
    public List<OtherCategoriesSimilarProducts.OtherCategoriesSimilarProduct> getOtherCategoriesSimilarProduct() {
        if (this.otherCategoriesSimilarProduct == null) this.otherCategoriesSimilarProduct =
            new ArrayList<OtherCategoriesSimilarProducts.OtherCategoriesSimilarProduct>();
        return this.otherCategoriesSimilarProduct;
    }

}
