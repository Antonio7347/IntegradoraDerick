package utez.edu.mx.integradoraderick.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import utez.edu.mx.integradoraderick.model.ColaCarritos;

import java.io.IOException;

@WebServlet("/verCarritosServlet")
public class VerCarritosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        ColaCarritos cola = (ColaCarritos) context.getAttribute("colaCarritos");

        if (cola == null) {
            cola = new ColaCarritos();
            context.setAttribute("colaCarritos", cola);
        }

        request.setAttribute("carritos", cola.getCarritos());
        request.getRequestDispatcher("verCarritos.jsp").forward(request, response);
    }
}

