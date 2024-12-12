package utez.edu.mx.integradoraderick.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import utez.edu.mx.integradoraderick.model.Carrito;
import utez.edu.mx.integradoraderick.model.ColaCarritos;

import java.io.IOException;

@WebServlet("/atenderCarritosServlet")
public class AtenderCarritoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener la cola de carritos desde el contexto de la aplicación
        ServletContext context = getServletContext();
        ColaCarritos colaCarritos = (ColaCarritos) context.getAttribute("colaCarritos");

        Carrito carritoActual = colaCarritos.getCarritos().poll();

        // Guardar la cola actualizada en el contexto
        context.setAttribute("colaCarritos", colaCarritos);

        HttpSession session = request.getSession();
        session.setAttribute("carrito", carritoActual);

        // Redirigir a la página de ver carritos
        // response.sendRedirect("/index.jsp");
        request.getRequestDispatcher("/verCarritos.jsp").forward(request, response);
    }
}
