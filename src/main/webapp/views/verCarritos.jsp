<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="utez.edu.mx.integradoraderick.model.Carrito" %>
<%@ page import="utez.edu.mx.integradoraderick.utils.Item" %>
<%@ page import="utez.edu.mx.integradoraderick.model.ColaCarritos" %>
<html>
<head>
    <title>Carritos Procesados</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
        }
        th {
            background-color: #f4f4f4;
            text-align: left;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
    </style>
</head>
<body>
<h1>Lista de Carritos Procesados</h1>

<table>
    <thead>
    <tr>
        <th>ID del Carrito</th>
        <th>Persona</th>
        <th>Items</th>
    </tr>
    </thead>
    <tbody>
    <%
        // Obtener la cola de carritos pasada por el servlet
        ColaCarritos cola = (ColaCarritos) request.getAttribute("colaCarritos");

        if (cola != null && !cola.isEmpty()) {
            for (Carrito carrito : cola.getCarritos()) {
    %>
    <tr>
        <td><%= carrito.getIdCarrito() %></td>
        <td><%= carrito.getPersona() %></td>
        <td>
            <ul>
                <% for (Item item : carrito.getItems()) { %>
                <li><%= item.getNombre() %> - <%= item.getCantidad() %></li>
                <% } %>
            </ul>
        </td>
    </tr>
    <%
        }
    } else {
    %>
    <tr>
        <td colspan="3">No hay carritos procesados.</td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
