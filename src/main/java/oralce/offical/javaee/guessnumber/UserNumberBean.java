package oralce.offical.javaee.guessnumber;

import java.io.Serializable;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserNumberBean implements Serializable{
	private static final long serialVersionUID = 5538691907367199213L;

	Integer randomInt = null;
	Integer userNumber = null;
	String response = null;
	private long maximum = 10;
	private long minimum = 0;
	
	public UserNumberBean() {
		Random randomGR = new Random();
		randomInt = new Integer(randomGR.nextInt(10));
		System.out.println("Duke's number: " + randomInt);
	}

	public Integer getRandomInt() {
		return randomInt;
	}

	public void setRandomInt(Integer randomInt) {
		this.randomInt = randomInt;
	}

	public Integer getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(Integer userNumber) {
		this.userNumber = userNumber;
	}

	public String getResponse() {
		if ((userNumber != null) && (userNumber.compareTo(randomInt) == 0)) {
            return "Yay! You got it!";
        } else {
            return "Sorry, " + userNumber + " is incorrect.";
        }
	}

	public long getMaximum() {
		return maximum;
	}

	public void setMaximum(long maximum) {
		this.maximum = maximum;
	}

	public long getMinimum() {
		return minimum;
	}

	public void setMinimum(long minimum) {
		this.minimum = minimum;
	}
}
