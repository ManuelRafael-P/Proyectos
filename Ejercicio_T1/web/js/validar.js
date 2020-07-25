/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validar(){
    var nombre1,precio1,stock1,categoria1;
    nombre1 = document.getElementById("nombre").value;
    precio1 = document.getElementById("precio").value;
    stock1 = document.getElementById("stock").value;
    categoria1 = document.getElementById("categoria").value;
    
    if(nombre1===""|precio1===""|stock1===""|categoria1===""){
        alert("Todos los campos son obligatorios");
        return false;
     
    }else if(isNaN(precio1)){
        alert("El precio debe ser un numero");
        return false;
    }
    else if(isNaN(stock1)){
        alert("El stock debe ser un numero");
        return false;
    }else if(nombre1.length>50){
        alert("El nombre es muy largo");
        return false;
    }else if(categoria1.length>50){
        alert("La categoria es muy larga");
        return false;
    }else if(precio1<0){
        alert("El valor del precio debe ser mayor a cero.")
        return false;
    }
    else if(stock1<0){
        alert("El valor del precio debe ser mayor a cero.")
        return false;
    }
    
}

