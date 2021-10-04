package kz.iitu.jakartaee.cdi;

import java.io.*;

import jakarta.inject.Inject;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "shopServlet", value = "/shop")
public class ShopServlet extends HttpServlet {
    private String message;

    //@Inject
    Cashier cashier;

    //@Inject
//    public ShopServlet(Cashier cashier) {
//        this.cashier = cashier;
//    }

    @Inject
    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public void init() {
        message = "Welcome to shop Alser!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        // Inject  cashier, set cashier name and print
        cashier.setName("Daniyar");
        out.println("<h1> Cashier name is : " + cashier.getName() + "</h1>");
        out.println("<h1> Cashier object  : " + cashier + "</h1>");

        out.println("</body></html>");
    }

    public void destroy() {
    }
}