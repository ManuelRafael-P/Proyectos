<%-- 
    Document   : index
    Created on : 03/05/2020, 01:17:45 PM
    Author     : Manuel
--%>

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
            
            a{
                width:200px;
                background-color: #74f7ea;
                padding: 10px;
                border-radius:10px;
                margin: 0 10px;
                text-decoration: none;
                color: black;
                margin: 0 auto;
                
            }

            
            h1{
                text-transform: uppercase;
                text-align: center;
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="contenedor">
            <h1>Actividad T1</h1>
        
        <a href="Controlador?accion=listar">Comienzo de programa</a>
            
        </div>
        
    </body>
</html>
