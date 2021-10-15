package kz.iitu.jakartaee.cdi.lc;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


import javax.persistence.criteria.CriteriaBuilder;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LCServlet", value = "/LCServlet")
public class LCServlet extends HttpServlet {

    @Inject
    PhoneManagerCycleBean phoneManagerCycleBean;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        writer.println(phoneManagerCycleBean.textCons);
        writer.println(phoneManagerCycleBean.getPricePhone());
        writer.println(phoneManagerCycleBean.getModelPhone());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

