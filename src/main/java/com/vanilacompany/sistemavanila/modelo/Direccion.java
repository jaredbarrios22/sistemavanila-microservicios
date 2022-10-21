/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Esteban Castillo
 */
@Entity
@Table(name="sv_direccion")
public class Direccion {
    
    @Id
    private int id;
    private String nombre;
    private int municipio;
    private int departamento;
    private String usuario;  
    
    public Direccion(){
        
    }
    
    public Direccion(int id, String nombre, int municipio, int departamento, String usuario){
        this.id = id;
        this.nombre = nombre;
        this.municipio = municipio;
        this.departamento = departamento;
        this.usuario = usuario;
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

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
