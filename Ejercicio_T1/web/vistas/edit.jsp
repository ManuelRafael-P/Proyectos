<%-- 
    Document   : edit
    Created on : 03/05/2020, 01:19:41 PM
    Author     : Manuel
--%>

<%@page import="Modelo.Producto"%>
<%@page import="ModeloDao.ProductoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="./js/validar1.js" ></script>
        <style>
            .contenedor{
                padding: 80px;
                width:70%;
                background-color: white;
                margin: 0 auto;
                border: 3px Solid black;
                border-radius: 10px;
            }
            body{
                background-color: #f5f5ed;
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
                height:50px;
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
            
            <%
                ProductoDao dao = new ProductoDao();
                int id = Integer.parseInt((String) request.getAttribute("idper"));
                Producto p = (Producto) dao.list(id);
            %>
            <h1>Modificar producto</h1>
            <form onsubmit="return validar();">
                <div>
                    <label>ID</label>
                    <input type="text" readonly="" value="<%=p.getId()%>"/>
                </div>
                <div>
                    <label>Nombre</label>
                    <input type="text" id="nombre" name="txtNom" value="<%=p.getNombre()%>"/>
                </div>
                <div>
                    <label>Precio</label>
                    <input type="text" id="precio" name="txtPrec" value="<%=p.getPrecio()%>"/>
                </div>
                <div>
                    <label>Stock</label>
                    <input type="text" id="stock" name="txtStock" value="<%=p.getStock()%>"/>
                </div>
                <div>
                    <label>Categoria</label>
                    <input type="text" id="categoria" name="txtCat" value="<%=p.getCategoria()%>"/>
                </div> 

                <input type="hidden" name="txtid" value="<%=p.getId()%>"/>
                <input type="submit" name="accion" value="Actualizar"/>

                <a href="Controlador?accion=listar">Regresar</a>
            </form>
        </div>
    </body>
</html>
