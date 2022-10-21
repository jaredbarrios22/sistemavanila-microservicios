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
@Table(name="sv_municipio")
public class Municipio {
    
    @Id
    private int id;
    private String nombre;
    private int departamento;
    
    public Municipio(){
        
    }
    
    public Municipio(int id, String nombre, int departamento){
        this.id = id;
        this.nombre = nombre;
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

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }
    
       
}
