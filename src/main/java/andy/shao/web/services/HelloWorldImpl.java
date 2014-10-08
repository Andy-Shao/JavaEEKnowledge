package andy.shao.web.services;

import javax.jws.WebService;

@WebService(serviceName="HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String sayHello(String text) {
		return "say" + text;
	}

}
