package kz.iitu.jakartaee.cdi.cashier;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.iitu.jakartaee.cdi.Cashier;

import java.io.IOException;

@WebServlet(name = "cashierServlet", value = "/cashier")
public class CashierServlet extends HttpServlet {

    @Inject
    CashierService cashierService;

    @Inject
    CashierSubscriber cashierSubscriber;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        cashierService.addCashier(new Cashier("TTT"));
        cashierService.addCashier(new Cashier("TTT"));
        resp.getWriter().write(cashierSubscriber.list.size() + " cashier added");
    }
}
