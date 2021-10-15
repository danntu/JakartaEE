package kz.iitu.jakartaee.cdi.ejb.stateless;

import jakarta.ejb.EJB;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletEjbStateless", value = "/ServletEjbStateless")
public class ServletEjbStateless extends HttpServlet {
    @EJB
    EjbStateless ejbStateless;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         ejbStateless.setI(10);
        response.getWriter().println(ejbStateless.getI());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
