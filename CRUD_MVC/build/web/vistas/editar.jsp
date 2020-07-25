<%-- 
    Document   : editar
    Created on : 02/05/2020, 11:05:43 AM
    Author     : Manuel
--%>

<%@page import="Modelo.Postulante"%>
<%@page import="ModeloDao.PersonaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/styles.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            PersonaDao dao = new PersonaDao();
            int id = Integer.parseInt((String) request.getAttribute("idper"));
            Postulante p = (Postulante) dao.list(id);
        %>
        <div class="contenedor">
            <h1>Modificar Postulante</h1>
            <form action=""Controlador>
                <div class=campo>
                    <label>DNI</label>
                    <input type="text" name="txtDni" value="<%=p.getDni()%>"/>
                </div>
                <div class="campo">
                    <label>Nombres</label>
                    <input type="text" name="txtNom" value="<%=p.getNombres()%>"/>
                </div>
                <div class="campo">
                    <label>Apellidos</label>
                    <input type="text" name="txtApe" value="<%=p.getApellidos()%>"/>
                </div>
                <div class="campo">
                    <label>Sexo</label>
                    <input type="text" name="txtSex" value="<%=p.getSexo()%>"/>
                </div>
                <div class="campo">
                    <label>Estado Civil</label>
                    <input type="text" name="txtEst" value="<%=p.getEst_civ()%>"/>
                </div>
                <div class="campo">
                    <label>Email</label>
                    <input type="text" name="txtEmail" value="<%=p.getEmail()%>"/>
                </div>
                <div class="campo">
                    <label>Telefono</label>
                    <input type="text" name="txtTelf" value="<%=p.getTelf()%>"/>
                </div>
                <input type="hidden" name="txtId" value="<%=p.getId()%>"/>
                <input type="submit" name="accion" value="Actualizar">            
            </form>
        </div>
    </body>
</html>
