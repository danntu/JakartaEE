package kz.iitu.jakartaee.cdi.manager;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/manager")
public class ManagerServlet extends HttpServlet {

    private final Manager manager;

    @Inject
    public ManagerServlet(@PhoneManagerQualifier  Manager manager) {
        this.manager = manager;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String result = manager.sellProduct("Samsung S20");
        resp.getWriter().println(result);
    }
}
