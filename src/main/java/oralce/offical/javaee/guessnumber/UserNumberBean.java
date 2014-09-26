package oralce.offical.javaee.guessnumber;

import java.io.Serializable;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserNumberBean implements Serializable {
    private static final long serialVersionUID = 5538691907367199213L;

    private long maximum = 10;
    private long minimum = 0;
    Integer randomInt = null;
    String response = null;
    Integer userNumber = null;

    public UserNumberBean() {
        Random randomGR = new Random();
        this.randomInt = new Integer(randomGR.nextInt(10));
        System.out.println("Duke's number: " + this.randomInt);
    }

    public long getMaximum() {
        return this.maximum;
    }

    public long getMinimum() {
        return this.minimum;
    }

    public Integer getRandomInt() {
        return this.randomInt;
    }

    public String getResponse() {
        if ((this.userNumber != null) && (this.userNumber.compareTo(this.randomInt) == 0)) {
            return "Yay! You got it!";
        } else {
            return "Sorry, " + this.userNumber + " is incorrect.";
        }
    }

    public Integer getUserNumber() {
        return this.userNumber;
    }

    public void setMaximum(long maximum) {
        this.maximum = maximum;
    }

    public void setMinimum(long minimum) {
        this.minimum = minimum;
    }

    public void setRandomInt(Integer randomInt) {
        this.randomInt = randomInt;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }
}
