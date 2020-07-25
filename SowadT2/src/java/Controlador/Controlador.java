/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Categoria;
import modelo.CategoriaDAO;
import modelo.Fabricante;
import modelo.FabricanteDAO;
import modelo.Pedido;
import modelo.PedidoDAO;
import modelo.Producto;
import modelo.ProductoDAO;

/**
 *
 * @author Manuel
 */
public class Controlador extends HttpServlet {

    Categoria c = new Categoria();
    CategoriaDAO cdao = new CategoriaDAO();
    Fabricante f = new Fabricante();
    FabricanteDAO fdao = new FabricanteDAO();
    Producto p = new Producto();
    ProductoDAO pdao = new ProductoDAO();

    Pedido pe = new Pedido();
    Pedido ped = new Pedido();
    PedidoDAO peddao = new PedidoDAO();

    List<Pedido> listape = new ArrayList<>();
    int fab = 1;
    String cod;
    int cant;
    float totalPagar = 0;
    List lista = cdao.listar();
    List lista1 = fdao.listar();
    List listaP = pdao.listar(fab);
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");

        if (menu.equals("Inicio")) {
            switch (accion) {
                case "Listar":

                    request.setAttribute("categoria", lista);
                    request.setAttribute("fabricante", lista1);
                    break;

            }
        }

        if (menu.equals("Producto")) {
            switch (accion) {
                case "Buscar":
                    request.setAttribute("productos", listaP);
                    request.setAttribute("categoria", lista);
                    request.setAttribute("fabricante", lista1);
                    break;
            }

        }
        if (menu.equals("Venta")) {
            switch (accion) {
                case "Agregar":
                    request.setAttribute("categoria", lista);
                    request.setAttribute("fabricante", lista1);
                    request.setAttribute("productos", listaP);
                    String cod = request.getParameter("cod");
                    float prec = Float.parseFloat(request.getParameter("precio"));
                    p.setCod(cod);
                    p.setPrecio(prec);
                    cod = p.getCod();
                    prec = p.getPrecio();
                    cant = 1;
                    pe = new Pedido();
                    pe.setCod_pro(cod);
                    pe.setCant_pe(cant);
                    pe.setPrec_pro(prec);
                    listape.add(pe);
                    for (int i = 0; i < listape.size(); i++) {
                        totalPagar = totalPagar + (listape.get(i).getCant_pe() * listape.get(i).getPrec_pro());
                    }
                    request.setAttribute("lista", listape);
                    request.setAttribute("total", totalPagar);
                    totalPagar = 0;
                    break;
            }
        }
        if (menu.equals("GenerarPedido")) {
            switch (accion) {
                case "generar":
                     List listaPedido = peddao.listar();
                    request.setAttribute("categoria", lista);
                    request.setAttribute("fabricante", lista1);
                    ped = new Pedido();
                    
                    for (int i = 0; i < listape.size(); i++) {
                        ped.setCod_pro(listape.get(i).getCod_pro());
                        ped.setCant_pe(listape.get(i).getCant_pe());
                        ped.setPrec_pro(listape.get(i).getPrec_pro());
                        peddao.GuardarPedido(ped);                        
                    }
                    request.setAttribute("listaPe", listaPedido);
                    
                    /*for (int i = 0; i < listape.size(); i++) {
                        Producto pr = new Producto();
                        String id=ped.getCod_pro();
                        int canti=ped.getCant_pe();
                        ProductoDAO ao = new ProductoDAO();
                        pr=ao.buscar(id);
                        int sac = pr.getStock()-canti;
                        pdao.actualizarStock(id, sac);
                    }*/
                    break;
                
            }
            request.getRequestDispatcher("principal.jsp").forward(request, response);
        }
        request.getRequestDispatcher("principal.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
