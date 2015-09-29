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
    "marketplaceDomain" , "awsAccessKeyId" , "associateTag" , "validate" , "xmlEscaping" , "shared" , "request"
})
@XmlRootElement(name = "BrowseNodeLookup")
public class BrowseNodeLookup {

    @XmlElement(name = "AssociateTag")
    protected String associateTag;
    @XmlElement(name = "AWSAccessKeyId")
    protected String awsAccessKeyId;
    @XmlElement(name = "MarketplaceDomain")
    protected String marketplaceDomain;
    @XmlElement(name = "Request")
    protected List<BrowseNodeLookupRequest> request;
    @XmlElement(name = "Shared")
    protected BrowseNodeLookupRequest shared;
    @XmlElement(name = "Validate")
    protected String validate;
    @XmlElement(name = "XMLEscaping")
    protected String xmlEscaping;

    
    public String getAssociateTag() {
        return this.associateTag;
    }

    
    public String getAWSAccessKeyId() {
        return this.awsAccessKeyId;
    }

    
    public String getMarketplaceDomain() {
        return this.marketplaceDomain;
    }

    
    public List<BrowseNodeLookupRequest> getRequest() {
        if (this.request == null) this.request = new ArrayList<BrowseNodeLookupRequest>();
        return this.request;
    }

    
    public BrowseNodeLookupRequest getShared() {
        return this.shared;
    }

    
    public String getValidate() {
        return this.validate;
    }

    
    public String getXMLEscaping() {
        return this.xmlEscaping;
    }

    
    public void setAssociateTag(String value) {
        this.associateTag = value;
    }

    
    public void setAWSAccessKeyId(String value) {
        this.awsAccessKeyId = value;
    }

    
    public void setMarketplaceDomain(String value) {
        this.marketplaceDomain = value;
    }

    
    public void setShared(BrowseNodeLookupRequest value) {
        this.shared = value;
    }

    
    public void setValidate(String value) {
        this.validate = value;
    }

    
    public void setXMLEscaping(String value) {
        this.xmlEscaping = value;
    }

}
