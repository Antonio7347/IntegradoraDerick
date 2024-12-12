package utez.edu.mx.integradoraderick.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import utez.edu.mx.integradoraderick.model.Carrito;
import utez.edu.mx.integradoraderick.model.ColaCarritos;

import java.io.IOException;

@WebServlet("/procesarSiguienteServlet")
public class ProcesarSiguienteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*ServletContext context = getServletContext();
        ColaCarritos cola = (ColaCarritos) context.getAttribute("colaCarritos");

        if (cola == null) {
            cola = new ColaCarritos();
            context.setAttribute("colaCarritos", cola);
        }

        Carrito carrito = cola.poll();
        if (carrito != null) {
            request.setAttribute("carritoProcesado", carrito);
        } else {
            request.setAttribute("mensaje", "No hay carritos por procesar.");
        }

        request.getRequestDispatcher("procesarCarritos.jsp").forward(request, response);*/
    }
}

