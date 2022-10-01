/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sv_usuario")

/**
 *
 * @author Esteban Castillo
 */
public class User {
    @Id
    String usuario;
    String contraseña;
    String nombre;
    String apellido;
    String telefono;
    String rol;
            
    public User(){
        
    }
    
    public User(String usuario, String nombre, String apellido, String contraseña, String telefono, String rol){
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "User{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", rol=" + rol + '}';
    }
    
    
    
}
