<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bienvenida</title>
</head>
<body>
<h1>¡Bienvenido a Los Frutilupis!</h1>
<form action="../llenarCarritoServlet" method="post">
    <button type="submit">Añadir carrito</button>
</form>
<form action="../verCarritosServlet" method="get">
    <button type="submit">Visualizar carritos</button>
</form>
</body>
</html>
