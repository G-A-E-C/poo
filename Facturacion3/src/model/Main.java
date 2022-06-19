/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Smart
 */
public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura();
        Empresa empresa = new Empresa("123", "Tienda de la esquina", "1123001", 12);
        factura.setEmpresa(empresa);
        Producto termo = new Producto("Termo", 10f, 12);
        factura.agregarProducto(termo, 3); 
        System.out.println(factura.getTotal());
        
    }
}
