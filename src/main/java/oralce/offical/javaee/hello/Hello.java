package oralce.offical.javaee.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloBean")
public class Hello {
    final String world = "Hello World!";

    public String getworld() {
        return this.world;
    }
}
