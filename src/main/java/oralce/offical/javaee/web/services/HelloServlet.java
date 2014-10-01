package oralce.offical.javaee.web.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oralce.offical.javaee.web.services.client.HelloService;

@WebServlet(name="HelloServlet", urlPatterns={"/HelloServlet"})
public class HelloServlet extends HttpServlet{
    private static final long serialVersionUID = 3394407236388805718L;
    private HelloService service = new HelloService();
    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException , IOException {
        processRequest(req , resp);
    }
    @Override
    protected void doPost(HttpServletRequest req , HttpServletResponse resp) throws ServletException , IOException {
        processRequest(req , resp);
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try(PrintWriter out = response.getWriter();){
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<titile>Servlet HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet at " + request.getContextPath() + "</h1>");
            out.println("<p>" + sayHello("world") + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    private String sayHello(java.lang.String arg0) {
        oralce.offical.javaee.web.services.client.Hello port = service.getHelloPort();
        return port.sayHello(arg0);
    }
}
