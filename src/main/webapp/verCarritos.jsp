<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="utez.edu.mx.integradoraderick.model.Carrito" %>
<%@ page import="utez.edu.mx.integradoraderick.utils.Item" %>
<%@ page import="utez.edu.mx.integradoraderick.model.ColaCarritos" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Carritos Procesados</title>
    <style>
        body { font-family: Arial, sans-serif; }
        table {
            border-collapse: collapse;
            width: 100%;
            margin-bottom: 20px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f4f4f4;
        }
        .details-table {
            width: 100%;
            border-collapse: collapse;
        }
        .details-table th,
        .details-table td {
            border: 1px solid #ddd;
            padding: 5px;
        }
    </style>
</head>
<body>
<h1>Lista de Carritos Procesados</h1>

<table>
    <thead>
    <tr>
        <th>Detalles Completos del Carrito</th>
    </tr>
    </thead>
    <tbody>
    <%
        // Obtener la cola de carritos desde el contexto de la aplicación
        ColaCarritos cola = (ColaCarritos) application.getAttribute("colaCarritos");

        if (cola != null && !cola.isEmpty()) {
            // Convertir la cola a una lista para poder iterar
            List<Carrito> carritos = new ArrayList<>();
            while (!cola.isEmpty()) {
                carritos.add(cola.atender());
            }

            // Volver a llenar la cola con los carritos
            for (Carrito carrito : carritos) {
                cola.offer(carrito);
            }

            // Guardar la cola actualizada en el contexto
            application.setAttribute("colaCarritos", cola);

            // Mostrar los carritos
            for (Carrito carrito : carritos) {
    %>
    <tr>
        <td>
            <h2>Carrito #<%= carrito.getId() %></h2>
            <table class="details-table">
                <tr>
                    <th>Propiedad</th>
                    <th>Valor</th>
                </tr>
                <tr>
                    <td>ID del Carrito</td>
                    <td><%= carrito.getId() %></td>
                </tr>
                <tr>
                    <td>Persona</td>
                    <td><%= carrito.getPersona() %></td>
                </tr>
                <tr>
                    <td>Número de Items</td>
                    <td><%= carrito.getItems().size() %></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <h3>Detalles de Items</h3>
                        <table class="details-table">
                            <tr>
                                <th>Índice</th>
                                <th>Nombre</th>
                                <th>toString()</th>
                            </tr>
                            <%
                                int index = 1;
                                for (Item item : carrito.getItems()) {
                            %>
                            <tr>
                                <td><%= index++ %></td>
                                <td><%= item.getNombre() %></td>
                                <td><%= item.toString() %></td>
                            </tr>
                            <% } %>
                        </table>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <%
        }
    } else {
    %>
    <tr>
        <td>No hay carritos procesados.</td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>