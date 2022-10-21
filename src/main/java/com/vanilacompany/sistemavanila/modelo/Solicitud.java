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
@Table(name="sv_solicitud")
public class Solicitud {
    @Id
    private int numerogestion;
    private String usuario;
    private double total;
    private Date fecha_solicitud;
    private int direccion;
    private boolean aplica_oferta;
    private int estado;
    
    public Solicitud(){
        
    }
    
    public Solicitud(int numerogestion, String usuario, double total, Date fecha_solicitud, int direccion, boolean aplica_oferta, int estado){
        this.numerogestion= numerogestion;
        this.usuario = usuario;
        this.total = total;
        this.fecha_solicitud = fecha_solicitud;
        this.direccion = direccion;
        this.aplica_oferta = aplica_oferta;
        this.estado = estado;
    }

    public int getNumerogestion() {
        return numerogestion;
    }

    public void setNumerogestion(int numerogestion) {
        this.numerogestion = numerogestion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(Date fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public boolean isAplica_oferta() {
        return aplica_oferta;
    }

    public void setAplica_oferta(boolean aplica_oferta) {
        this.aplica_oferta = aplica_oferta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
