package oralce.offical.javaee.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SimpleServletListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		//do something in here
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		//do something in here
	}

}
