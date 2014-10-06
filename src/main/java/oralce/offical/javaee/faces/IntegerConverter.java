package oralce.offical.javaee.faces;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value="integerConverter")
public class IntegerConverter implements Converter {
	private final Converter converter = new javax.faces.convert.IntegerConverter();
 
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		return this.converter.getAsObject(arg0, arg1, arg2);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		return this.converter.getAsString(arg0, arg1, arg2);
	}

}
