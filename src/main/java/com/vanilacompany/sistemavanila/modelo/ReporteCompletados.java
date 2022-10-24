/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Esteban Castillo
 */
@Entity
public class ReporteCompletados {
    @Id
    private int numerogestion;
    private String usuario;
    private double total;
    private Date fecha_solicitud;
    private boolean aplica_oferta;
    private String descripcion;
    private String municipio;
    private String departamento;
    
    private ReporteCompletados(){
        
    }
    
    private ReporteCompletados(int numerogestion, String usuario, double total, Date fecha_solicitud, boolean aplica_oferta, String descripcion, String municipio, String departamento){
        this.numerogestion = numerogestion;
        this.usuario = usuario;
        this.total = total;
        this.fecha_solicitud = fecha_solicitud;
        this.aplica_oferta = aplica_oferta;
        this.descripcion = descripcion;
        this.municipio = municipio;
        this.departamento = departamento;
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

    public boolean isAplica_oferta() {
        return aplica_oferta;
    }

    public void setAplica_oferta(boolean aplica_oferta) {
        this.aplica_oferta = aplica_oferta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
