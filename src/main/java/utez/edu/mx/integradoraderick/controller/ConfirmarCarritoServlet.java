package utez.edu.mx.integradoraderick.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import utez.edu.mx.integradoraderick.model.Carrito;
import utez.edu.mx.integradoraderick.model.ColaCarritos;

import java.io.IOException;

@WebServlet("/confirmarCarritoServlet")
public class ConfirmarCarritoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Carrito carrito = (Carrito) session.getAttribute("carritoActual");

        if (carrito != null) {
            // Obtener o crear la cola global
            ServletContext context = getServletContext();
            ColaCarritos cola = (ColaCarritos) context.getAttribute("colaCarritos");

            if (cola == null) {
                cola = new ColaCarritos();
                context.setAttribute("colaCarritos", cola);
            }

            cola.offer(carrito); // Añadir a la cola
            session.removeAttribute("carritoActual"); // Limpiar sesión
        }

        response.sendRedirect("index.jsp");
    }
}

