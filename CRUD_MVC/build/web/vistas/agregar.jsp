<%-- 
    Document   : agregar
    Created on : 02/05/2020, 11:05:37 AM
    Author     : Manuel
--%>

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
            <h1>Agregar postulante</h1>
            <form action=""Controlador>
                <div class=campo>
                    <label>DNI</label>
                    <input type="text" name="txtDni"/>
                </div>
                <div class="campo">
                    <label>Nombres</label>
                    <input type="text" name="txtNom"/>
                </div>
                <div class="campo">
                    <label>Apellidos</label>
                    <input type="text" name="txtApe"/>
                </div>
                <div class="campo">
                    <label>Sexo</label>
                    <input type="text" name="txtSex"/>
                </div>
                <div class="campo">
                    <label>Estado Civil</label>
                    <input type="text" name="txtEst"/>
                </div>
                <div class="campo">
                    <label>Email</label>
                    <input type="text" name="txtEmail"/>
                </div>
                <div class="campo">
                    <label>Telefono</label>
                    <input type="text" name="txtTelf"/>
                </div>
                <input type="submit" name="accion" value="Agregar">            
            </form>
        </div>
    </body>
</html>
