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
public class ReportePedidosByUsuario {
    @Id
    private int numerogestion;
    private double total;
    private Date fecha_solicitud;
    private String estado;
    private String descripcion;
    private String municipio;
    private String departamento;
    
    
    public ReportePedidosByUsuario(){
        
    }
    
    public ReportePedidosByUsuario(int numerogestion, double total, Date fecha_solicitud, String estado, String descripcion, String municipio, String departamento){
        this.numerogestion = numerogestion;
        this.total = total;
        this.fecha_solicitud = fecha_solicitud;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
