package oralce.offical.javaee.el;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Customer {

    private String lName = Customer.class.getSimpleName();

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    
    public String calcTotal(String str){
        return "calcTotal." + str;
    }
}
