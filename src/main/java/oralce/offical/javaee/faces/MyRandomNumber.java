package oralce.offical.javaee.faces;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MyRandomNumber {

    private final Random random = new Random();
    
    public boolean getRandomBoolean(){
        return this.random.nextBoolean();
    }
    
    public boolean giveTrue(){
        return true;
    }
    
    public boolean giveFalse(){
        return false;
    }
    
    public String[] items(){
        return new String[]{"Maven Book", "SubVersion Book", "Other Book"};
    }
    
    public List<String> list(){
    	return Arrays.asList(items());
    }
}
