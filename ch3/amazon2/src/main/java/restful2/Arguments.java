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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "" , propOrder = {
    "argument"
})
@XmlRootElement(name = "Arguments")
public class Arguments {

    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Argument {

        @XmlAttribute(name = "Name" , required = true)
        protected String name;
        @XmlAttribute(name = "Value")
        protected String value;

        
        public String getName() {
            return this.name;
        }

        
        public String getValue() {
            return this.value;
        }

        
        public void setName(String value) {
            this.name = value;
        }

        
        public void setValue(String value) {
            this.value = value;
        }

    }

    @XmlElement(name = "Argument" , required = true)
    protected List<Arguments.Argument> argument;

    
    public List<Arguments.Argument> getArgument() {
        if (this.argument == null) this.argument = new ArrayList<Arguments.Argument>();
        return this.argument;
    }

}
