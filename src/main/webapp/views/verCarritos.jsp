<%--
  Created by IntelliJ IDEA.
  User: Joseb
  Date: 10/12/2024
  Time: 11:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%--<%@ page import="your.package.Carrito" %>--%>
<%@ page import="utez.edu.mx.integradoraderick.model.Carrito" %>
<%--<%@ page import="your.package.Item" %>--%>
<%@ page import="utez.edu.mx.integradoraderick.utils.Item" %>
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

<c:if test="${not empty carritos}">
    <table>
        <thead>
        <tr>
            <th>ID del Carrito</th>
            <th>Persona</th>
            <th>Items</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="carrito" items="${carritos}">
            <tr>
                <td>${carrito.id}</td>
                <td>${carrito.persona}</td>
                <td>
                    <ul>
                        <c:forEach var="item" items="${carrito.items}">
                            <li>${item.nombre} - Cantidad: ${item.cantidad}</li>
                        </c:forEach>
                    </ul>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>

<c:if test="${empty carritos}">
    <p>No hay carritos procesados.</p>
</c:if>
</body>
</html>
