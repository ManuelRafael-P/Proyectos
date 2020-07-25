<%-- 
    Document   : principal
    Created on : 31/05/2020, 11:20:50 AM
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+JP&display=swap" rel="stylesheet">
<link href="CSS/style.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="imagen container">
            <image src="imagenes/logo.png">
        </div>
        <div class="container">
            <form action="Controlador?menu=Producto" method="post">
                <div class="campo">
                    <label>Categoria</label>
                    <select type="text" name="categoria">                
                        <c:forEach var="cat" items="${categoria}">
                            <option value="1">${cat.getDescripcion_cat()}</option>                        
                        </c:forEach>
                    </select>
                </div>
                <div class="campo">
                    <label>Fabricante</label>
                    <select type="text" name="fabricante">                
                        <c:forEach var="fab" items="${fabricante}">
                            <option>${fab.getNom_fabricante()}</option>                        
                        </c:forEach>                      
                    </select>
                </div> 
                <div clas="campo">
                    <input type="submit" name="accion" value="Buscar">
                </div>
            </form>
        </div> 

        <div class="container">
            <h2>Catalogo de Productos</h2>
            <table border="1">
                <thead>
                    <tr>
                        <th>Codigo</th>
                        <th>Descripcion</th>
                        <th>Precio</th>
                        <th>Opciones</th>                    
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="pro" items="${productos}">
                        <tr>
                            <td>${pro.getCod()}</td>
                            <td>${pro.getDescripcion()}</td>
                            <td>${pro.getPrecio()}</td>
                            <td><a href="Controlador?menu=Venta&accion=Agregar&cod=${pro.getCod()}&precio=${pro.getPrecio()}">Agregar</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="container"> 
            <h2>Productos seleccionados</h2>
            <table border="1">
                <thead>
                <th>Producto</th>
                <th>Cantidad</th>
                <th>Precio</th>
                </thead>
                <tbody>
                    <c:forEach var="pedido" items="${lista}">
                        <tr>
                            <td>${pedido.getCod_pro()}</td>
                            <td>${pedido.getCant_pe()}</td>
                            <td>${pedido.getPrec_pro()}</td>                    
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

            <label>Total a pagar</label>
            <input type="text" name="totalPagar" value="S/ ${total}0">
            <br>
            <a href="Controlador?menu=GenerarPedido&accion=generar">Generar pedido</a>
        </div>        

        <div class="container">
            <h2>Pedidos realizados</h2>
            <table border="1">
                <thead>
                    <tr>
                        <th>Codigo</th>
                        <th>Producto</th>
                        <th>Cantidad</th>
                        <th>Precio</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="pe" items="${listaPe}">
                        <tr>
                            <td>${pe.getCod_pe()}</td>
                            <td>${pe.getCod_pro()}</td>
                            <td>${pe.getCant_pe()}</td>
                            <td>${pe.getPrec_pro()}</td>
                        </tr>
                    </c:forEach>  
                </tbody>
            </table>

            <a href="Controlador?menu=Inicio&accion=Listar">Regresar</a>
        </div>
    </body>
</html>
