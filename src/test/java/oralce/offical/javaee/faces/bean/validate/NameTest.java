package oralce.offical.javaee.faces.bean.validate;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

public class NameTest {
	private static Validator validator;
	
	@BeforeClass
	public static void beforeClass(){
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void test(){
		Name name = new Name();
		
		Set<ConstraintViolation<Name>> constraintViolations = validator.validate(name);
		
		for(ConstraintViolation<Name> constraintViolation : constraintViolations)
			System.out.println(constraintViolation.getMessage());
	}
}
