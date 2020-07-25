<%-- 
    Document   : listar
    Created on : 03/05/2020, 01:19:22 PM
    Author     : Manuel
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Producto"%>
<%@page import="ModeloDao.ProductoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            body{
                background-color:#f5f5ed;
            }
            .contenedor{
                background-color:white;
                width:80%;
                margin: 0 auto;
                padding: 20px;
                position:relative;
            }
            table{
                border: 1px Solid #f0f0f0;
                text-align: center;
                margin: 0 auto;
            }

            table th{
                background-color : #fcba03;
                padding:15px 60px;

            }
            table td{
                padding: 20px;

            }
            a.editar{
                background-color: #68ed8c;
                padding: 10px;
                border-radius:10px;
                margin: 0 10px;
                text-decoration: none;
                color: black;
            }
            a.eliminar{
                background-color: #e85d5d;
                padding: 10px;
                border-radius:10px;
                margin: 0 10px;
                text-decoration: none;
                color: black;
            }
            img{
                margin: 0 auto;
            }

            .contenedor2{
                background-color:white;
                width:82.7%;
                margin: 0 auto;
            }
            
            a.add{
                width:200px;
                background-color: #74f7ea;
                padding: 10px;
                border-radius:10px;
                margin: 0 10px;
                text-decoration: none;
                color: black;
                
            }

            
            h1{
                text-transform: uppercase;
                text-align: center;
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <br>
        <br>
        <div class="contenedor2">
            <img src="./img/cabecera.png" alt="Smiley face" width="1180" height="124">
        </div>

        <div class="contenedor">

            <h1>Lista de productos</h1>
            <br>
            <a class="add topright" href="Controlador?accion=add">Agregar Nuevo</a>
            <br/>
            <br/>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Precio</th>
                        <th>Stock</th>
                        <th>Categoria</th>
                        <th>Opciones</th>
                    </tr>
                </thead>
                <%
                    ProductoDao dao = new ProductoDao();
                    List<Producto> list = dao.listar();
                    Iterator<Producto> iter = list.iterator();
                    Producto prod = null;
                    while (iter.hasNext()) {
                        prod = iter.next();

                %>
                <tbody>
                    <tr>
                        <td><%=prod.getId()%></td>
                        <td><%=prod.getNombre()%></td>
                        <td><%=prod.getPrecio()%></td>
                        <td><%=prod.getStock()%></td>
                        <td><%=prod.getCategoria()%></td>
                        <td>
                            <a class="editar" href="Controlador?accion=editar&id=<%=prod.getId()%>">Editar</a>
                            <a class="eliminar" href="Controlador?accion=eliminar&id=<%=prod.getId()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
