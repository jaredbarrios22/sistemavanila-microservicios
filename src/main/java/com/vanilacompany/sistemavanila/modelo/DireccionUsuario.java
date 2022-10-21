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
public class DireccionUsuario {
    @Id
    private int id;
    private String nombre;
    private String municipio;
    private String departamento;
    
    public DireccionUsuario(){
        
    }
    
    public DireccionUsuario(int id, String nombre, String municipio, String departamento){
        this.id = id;
        this.nombre = nombre;
        this.municipio = municipio;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
