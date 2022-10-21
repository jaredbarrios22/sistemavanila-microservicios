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
public class ReporteUsuarios {
    @Id
    private String usuario;
    private String nombre;
    private String apellido;
    private int telefono;
    private String rol;
        
    public ReporteUsuarios(){
        
    }
    
    public ReporteUsuarios(String usuario, String nombre, String apellido, int telefono, String rol){
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.rol = rol;    
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
