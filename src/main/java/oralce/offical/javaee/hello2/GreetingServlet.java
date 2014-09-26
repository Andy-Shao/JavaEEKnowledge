package oralce.offical.javaee.hello2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet{
	private static final long serialVersionUID = -3057557684987089079L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setBufferSize(8192);
		PrintWriter out = resp.getWriter();
		
		// then write the data of the response
        out.println("<html lang=\"en\">"
                + "<head><title>Servlet Hello</title></head>");

        // then write the data of the response
        out.println("<body  bgcolor=\"#ffffff\">"
            + "<img src=\"\" alt=\"Duke waving his hand\">"
            + "<form method=\"get\">"
            + "<h2>Hello, my name is Duke. What's yours?</h2>"
            + "<input title=\"My name is: \"type=\"text\" "
            + "name=\"username\" size=\"25\">"
            + "<p></p>"
            + "<input type=\"submit\" value=\"Submit\">"
            + "<input type=\"reset\" value=\"Reset\">"
            + "</form>");

        String username = req.getParameter("username");
        if (username != null && username.length() > 0) {
            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher("/greetingResponse");

            if (dispatcher != null) {
                dispatcher.include(req, resp);
            }
        }
        out.println("</body></html>");
        out.close();
	}

}
