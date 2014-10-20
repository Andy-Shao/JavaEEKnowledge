package oralce.offical.javaee.enterprise.bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="converterServlet", urlPatterns="/converterServlet")
public class ConverterServlet extends HttpServlet{
	private static final long serialVersionUID = -1000768077855560917L;

	@EJB
	ConverterBean converterBean;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try(PrintWriter out = resp.getWriter();){
			out.println("<html>");
			out.println("<head></head>");
			out.println("<body>");
			out.println("<h1>ConverterServlet</h1>");
			out.println(this.converterBean.toString());
			out.println("</body>");
			out.println("</html>");
		}
	}
}
