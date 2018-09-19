package maven.test.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CicloVidaServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("INICIANDO SERVLET....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        System.out.println("LLAMANDO AL SERVICE DEL SERVLET....");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("DESTRUYENDO SERVLET....");
    }

}
