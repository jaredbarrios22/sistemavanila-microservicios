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
public class ReporteAdministradores {
    @Id
    private String usuario;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String municipio;
    private String departamento;
    
    public ReporteAdministradores(){
        
    }
    
    public ReporteAdministradores(String usuario, String nombre, String apellido, String telefono, String direccion, String municipio, String departamento){
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.municipio = municipio;
        this.departamento = departamento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
