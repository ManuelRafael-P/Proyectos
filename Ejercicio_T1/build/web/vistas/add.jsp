<%-- 
    Document   : add
    Created on : 03/05/2020, 01:19:31 PM
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="./js/validar.js" ></script>
        <style>
            .contenedor{
                padding: 100px;
                width:70%;
                background-color: white;
                margin: 0 auto;
            }
            body{
                background-color: black;
            }
            input[type=text], select {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }
            input[type=submit] {
                width: 100%;
                background-color: #fcba03;
                color: white;
                padding: 14px 20px;
                margin: 10px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                align-items: center;
            }
            input[type=submit]:hover {
                background-color: black;
                color: #fcba03;
                transition: .5s ease-in-out;
            }
            
            h1{
                text-align: center;
                text-transform: uppercase;
            }
            a{  
                text-decoration:none;
                width: 96%;
                background-color: #fcba03;
                color: white;
                padding: 14px 20px;
                margin: 10px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                align-items: center;
                display: inline-block;
                text-align:center;
            }
            a:hover{
                background-color: black;
                color: #fcba03;
                transition: .5s ease-in-out;
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="contenedor">
            <h1>Agregar producto</h1>
            <form onsubmit="return validar();">
                <div>
                    <label>ID</label>
                    <input type="text" disabled/>
                </div>
                <div>
                    <label>Nombre</label>
                    <input type="text" id="nombre" name="txtNom" placeholder="Ingrese nombre" required/>
                </div>
                <div>
                    <label>Precio</label>
                    <input type="text" id="precio" name="txtPrec" placeholder="Ingrese precio" required/>
                </div>
                <div>
                    <label>Stock</label>
                    <input type="text" id="stock" name="txtStock" placeholder="Ingrese stock de producto" required/>
                </div>
                <div>
                    <label>Categoria</label>
                    <input type="text" id="categoria" name="txtCat" placeholder="Ingrese categoria" required/>
                </div> 
                <input type="submit" name="accion" value="Agregar"/>
                <br>
                <br>
                
            </form>
            <a href="Controlador?accion=listar">Regresar</a>
        </div>
    </body>
</html>
