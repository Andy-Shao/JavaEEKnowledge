package oralce.offical.javaee.faces.bean.validate;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hamcrest.Matchers;
import org.junit.Assert;
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
		
		Assert.assertThat(constraintViolations.size(), Matchers.is(2));
	}
}
