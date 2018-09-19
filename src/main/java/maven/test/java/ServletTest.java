package maven.test.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ServletTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>");
        writer.println("Hola mundo desde Servlet!!!");
        writer.println("</h1>");
    }
}
