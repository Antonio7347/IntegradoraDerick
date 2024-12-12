package utez.edu.mx.integradoraderick.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import utez.edu.mx.integradoraderick.model.Carrito;
import utez.edu.mx.integradoraderick.model.ColaCarritos;
import utez.edu.mx.integradoraderick.model.Persona;
import utez.edu.mx.integradoraderick.utils.Item;

import java.io.IOException;

@WebServlet("/index")
public class VolverIndex extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener la cola de carritos desde el contexto de la aplicación
        ServletContext context = getServletContext();
        ColaCarritos colaCarritos = (ColaCarritos) context.getAttribute("colaCarritos");

        // Si no existe la cola, inicializarla
        if (colaCarritos == null) {
            colaCarritos = new ColaCarritos();

            // Guardar la cola en el contexto
            context.setAttribute("colaCarritos", colaCarritos);
        }

        // Pasar la cola al JSP
        request.setAttribute("colaCarritos", colaCarritos);

        // Redirigir al JSP
        request.getRequestDispatcher("/verCarritos.jsp").forward(request, response);
    }
}


