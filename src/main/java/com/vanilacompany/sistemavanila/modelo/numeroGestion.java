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
public class numeroGestion {
    
    @Id
    private int numerogestion;
    
    public numeroGestion(){
        
    }
    
    public numeroGestion(int numerogestion){
        this.numerogestion = numerogestion;
    }

    public int getNumeroGestion() {
        return numerogestion;
    }

    public void setNumeroGestion(int numerogestion) {
        this.numerogestion = numerogestion;
    }
    
    
}
