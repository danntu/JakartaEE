package kz.iitu.jakartaee.cdi.ejb.local;

import jakarta.ejb.EJB;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletLocal", value = "/ServletLocal")
public class ServletLocal extends HttpServlet {
    @EJB
    LocalInterface localInterface;

    @EJB
    ExampleBean exampleBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("localInterface.getName() = " + localInterface.getName());
        response.getWriter().println("exampleBean.getName() = " + exampleBean.getName());
        response.getWriter().println("exampleBean.getAnotherName() = " + exampleBean.getAnotherName());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
