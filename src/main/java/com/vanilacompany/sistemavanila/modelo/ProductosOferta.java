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
@Table(name="sv_productos_oferta")
public class ProductosOferta {
    private int id_oferta;
    private int producto;
    private int cantidad;
    private Date fecha_ingreso;
    private String usuario_ingreso;
    @Id
    private int id;
    
    
    public ProductosOferta(){
        
    }
    
    public ProductosOferta(int id_oferta, int producto, int cantidad, Date fecha_ingreso, String usuario_ingreso, int id){
        this.id_oferta = id_oferta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha_ingreso = fecha_ingreso;
        this.usuario_ingreso = usuario_ingreso;
        this.id = id;
    }

    public int getId_oferta() {
        return id_oferta;
    }

    public void setId_oferta(int id_oferta) {
        this.id_oferta = id_oferta;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
