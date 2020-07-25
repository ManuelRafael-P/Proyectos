/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validar(){
    var nombre,precio,precio,stock,categoria;
    nombre = document.getElementById("nombre").value;
    precio = document.getElementById("precio").value;
    stock = document.getElementById("stock").value;
    categoria = document.getElementById("categoria").value;
    
    if(isNaN(precio)){
        alert("El precio debe ser un numero");
        return false;
    }
    else if(isNaN(stock)){
        alert("El stock debe ser un numero");
        return false;
    }else if(nombre.length>50){
        alert("El nombre es muy largo");
        return false;
    }else if(categoria.length>50){
        alert("La categoria es muy larga");
        return false;
    }else if(precio<0){
        alert("El valor del precio debe ser mayor a cero.")
        return false;
    }
    else if(stock<0){
        alert("El valor del precio debe ser mayor a cero.")
        return false;
    }
    
}
