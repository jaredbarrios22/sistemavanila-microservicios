/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Esteban Castillo
 */
@Entity
public class DetalleProductosSolicitud {
    @Id
    private int id;
    private String producto;
    private int cantidad;
    private double precio;
    
    public DetalleProductosSolicitud (){
        
    }
    
    public DetalleProductosSolicitud(int id, String producto, int cantidad, double precio){
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
