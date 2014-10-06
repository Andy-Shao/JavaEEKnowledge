package oralce.offical.javaee.faces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Converters {

	Integer integer;

	public Integer getInteger() {
		return integer;
	}

	public void setInteger(Integer integer) {
		this.integer = integer;
	}

	@Override
	public String toString() {
		return "Converters [integer=" + integer + "]";
	}
}
