package kz.iitu.jakartaee.cdi.interceptors;

import jakarta.inject.Inject;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "InterceptorServlet", value = "/InterceptorServlet")
public class InterceptorServlet extends HttpServlet {

    @Inject
    PhoneManagerCycleBeanInterceptor phoneManagerCycleBeanInterceptor;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        phoneManagerCycleBeanInterceptor.getModelPhone();
        phoneManagerCycleBeanInterceptor.getPricePhone();
    }


}
