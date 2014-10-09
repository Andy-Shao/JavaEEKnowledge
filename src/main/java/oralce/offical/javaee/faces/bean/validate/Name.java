package oralce.offical.javaee.faces.bean.validate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Name {
	@NotNull(message="firstname can't is null.")
	@Size(min=1, max=16, message="the firstname which the max value is 16 and the min value is 1.")
	private String firstname;
	
	@NotNull
	@Size(min=1, max=16)
	private String lastname;

	public Name() {
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
