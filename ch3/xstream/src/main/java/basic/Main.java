package basic;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Main {
    public static void main(String[] args) {
        PersonNoProps bd = new PersonNoProps("Bjoern Daehlie" , 49 , "Male");
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("skier" , PersonNoProps.class); // for readability

        // serialize
        String xml = xstream.toXML(bd);
        System.out.println(xml);
        PersonNoProps bdClone = (PersonNoProps) xstream.fromXML(xml);
        System.out.println(xstream.toXML(bdClone));
    }
}
