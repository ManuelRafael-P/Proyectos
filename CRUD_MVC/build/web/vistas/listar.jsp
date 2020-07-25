<%-- 
    Document   : listar
    Created on : 02/05/2020, 11:05:29 AM
    Author     : Manuel
--%>

<%@page import="ModeloDao.PersonaDao"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Postulante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/styles.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="contenedor">
            <h1>Postulantes</h1>
            <a href="Controlador?accion=add">Agregar Nuevo</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>DNI</th>
                        <th>Nombres</th>
                        <th>Apellidos</th>
                        <th>Sexo</th>
                        <th>Estado Civil</th>
                        <th>Email</th>
                        <th>Telefono</th>
                        <th>Opciones</th>
                    </tr>
                </thead>
                <%
                    PersonaDao dao =  new PersonaDao();
                    List<Postulante>list=dao.listar();
                    Iterator<Postulante>iter=list.iterator();
                    Postulante per = null;
                    while(iter.hasNext()){
                        per = iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td><%=per.getId()%></td>
                        <td><%=per.getDni()%></td>
                        <td><%=per.getNombres()%></td>
                        <td><%=per.getApellidos()%></td>
                        <td><%=per.getSexo()%></td>
                        <td><%=per.getEst_civ()%></td>
                        <td><%=per.getEmail()%></td>
                        <td><%=per.getTelf()%></td>
                        <td>
                            <a href="Controlador?accion=editar&id=<%=per.getId()%>">Editar</a>
                            <a href="Controlador?accion=eliminar&id=<%=per.getId()%>">Eliminar</a>
                        </td>
                        
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
