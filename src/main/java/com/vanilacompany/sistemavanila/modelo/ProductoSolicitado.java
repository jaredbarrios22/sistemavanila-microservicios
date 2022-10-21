/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Esteban Castillo
 */
@Entity
@Table(name="sv_producto_solicitados")
public class ProductoSolicitado {
    
    @Id
    private int id;
    private int numerogestion;
    private int producto;
    private int cantidad;
    private double precio;
    private Date fecha_ingreso;
    private String usuario_ingreso;
    
    public ProductoSolicitado(){
        
    }
    
    public ProductoSolicitado(int id, int numerogestion, int producto, int cantidad, double precio, Date fecha_ingreso, String usuario_ingreso){
        this.id = id;
        this.numerogestion = numerogestion;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha_ingreso = fecha_ingreso;
        this.usuario_ingreso = usuario_ingreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getNumerogestion() {
        return numerogestion;
    }

    public void setNumerogestion(int numerogestion) {
        this.numerogestion = numerogestion;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
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

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getUsuario_ingreso() {
        return usuario_ingreso;
    }

    public void setUsuario_ingreso(String usuario_ingreso) {
        this.usuario_ingreso = usuario_ingreso;
    }
      
    
}
