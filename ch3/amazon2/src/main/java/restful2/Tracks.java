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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "" , propOrder = {
    "disc"
})
@XmlRootElement(name = "Tracks")
public class Tracks {

    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "" , propOrder = {
        "track"
    })
    public static class Disc {

        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "" , propOrder = {
            "value"
        })
        public static class Track {

            @XmlAttribute(name = "Number" , required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger number;
            @XmlValue
            protected String value;

            
            public BigInteger getNumber() {
                return this.number;
            }

            
            public String getValue() {
                return this.value;
            }

            
            public void setNumber(BigInteger value) {
                this.number = value;
            }

            
            public void setValue(String value) {
                this.value = value;
            }

        }

        @XmlAttribute(name = "Number" , required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger number;

        @XmlElement(name = "Track" , required = true)
        protected List<Tracks.Disc.Track> track;

        
        public BigInteger getNumber() {
            return this.number;
        }

        
        public List<Tracks.Disc.Track> getTrack() {
            if (this.track == null) this.track = new ArrayList<Tracks.Disc.Track>();
            return this.track;
        }

        
        public void setNumber(BigInteger value) {
            this.number = value;
        }

    }

    @XmlElement(name = "Disc" , required = true)
    protected List<Tracks.Disc> disc;

    
    public List<Tracks.Disc> getDisc() {
        if (this.disc == null) this.disc = new ArrayList<Tracks.Disc>();
        return this.disc;
    }

}
