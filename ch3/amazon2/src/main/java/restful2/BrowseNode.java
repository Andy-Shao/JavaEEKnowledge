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
    "browseNodeId" , "name" , "isCategoryRoot" , "properties" , "children" , "ancestors" , "topSellers" ,
    "newReleases" , "topItemSet"
})
@XmlRootElement(name = "BrowseNode")
public class BrowseNode {

    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "" , propOrder = {
        "browseNode"
    })
    public static class Ancestors {

        @XmlElement(name = "BrowseNode" , required = true)
        protected List<BrowseNode> browseNode;

        
        public List<BrowseNode> getBrowseNode() {
            if (this.browseNode == null) this.browseNode = new ArrayList<BrowseNode>();
            return this.browseNode;
        }

    }

    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "" , propOrder = {
        "browseNode"
    })
    public static class Children {

        @XmlElement(name = "BrowseNode" , required = true)
        protected List<BrowseNode> browseNode;

        
        public List<BrowseNode> getBrowseNode() {
            if (this.browseNode == null) this.browseNode = new ArrayList<BrowseNode>();
            return this.browseNode;
        }

    }

    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "" , propOrder = {
        "property"
    })
    public static class Properties {

        @XmlElement(name = "Property" , required = true)
        protected List<Property> property;

        
        public List<Property> getProperty() {
            if (this.property == null) this.property = new ArrayList<Property>();
            return this.property;
        }

    }

    @XmlElement(name = "Ancestors")
    protected BrowseNode.Ancestors ancestors;
    @XmlElement(name = "BrowseNodeId")
    protected String browseNodeId;
    @XmlElement(name = "Children")
    protected BrowseNode.Children children;
    @XmlElement(name = "IsCategoryRoot")
    protected Boolean isCategoryRoot;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NewReleases")
    protected NewReleases newReleases;

    @XmlElement(name = "Properties")
    protected BrowseNode.Properties properties;

    @XmlElement(name = "TopItemSet")
    protected List<TopItemSet> topItemSet;

    @XmlElement(name = "TopSellers")
    protected TopSellers topSellers;

    
    public BrowseNode.Ancestors getAncestors() {
        return this.ancestors;
    }

    
    public String getBrowseNodeId() {
        return this.browseNodeId;
    }

    
    public BrowseNode.Children getChildren() {
        return this.children;
    }

    
    public String getName() {
        return this.name;
    }

    
    public NewReleases getNewReleases() {
        return this.newReleases;
    }

    
    public BrowseNode.Properties getProperties() {
        return this.properties;
    }

    
    public List<TopItemSet> getTopItemSet() {
        if (this.topItemSet == null) this.topItemSet = new ArrayList<TopItemSet>();
        return this.topItemSet;
    }

    
    public TopSellers getTopSellers() {
        return this.topSellers;
    }

    
    public Boolean isIsCategoryRoot() {
        return this.isCategoryRoot;
    }

    
    public void setAncestors(BrowseNode.Ancestors value) {
        this.ancestors = value;
    }

    
    public void setBrowseNodeId(String value) {
        this.browseNodeId = value;
    }

    
    public void setChildren(BrowseNode.Children value) {
        this.children = value;
    }

    
    public void setIsCategoryRoot(Boolean value) {
        this.isCategoryRoot = value;
    }

    
    public void setName(String value) {
        this.name = value;
    }

    
    public void setNewReleases(NewReleases value) {
        this.newReleases = value;
    }

    
    public void setProperties(BrowseNode.Properties value) {
        this.properties = value;
    }

    
    public void setTopSellers(TopSellers value) {
        this.topSellers = value;
    }

}
