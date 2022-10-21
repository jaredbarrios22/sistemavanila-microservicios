/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.controller;

import com.vanilacompany.sistemavanila.modelo.Ofertas;
import com.vanilacompany.sistemavanila.repository.OfertasRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Esteban Castillo
 */
//@CrossOrigin(origins ="https://sistema-vanila.azurewebsites.net")
    @CrossOrigin(origins ="http://localhost:4200")
    @RestController
    @RequestMapping(path="/ofertas")
public class OfertasController {
    @Autowired
    private OfertasRepository repo;
    
    @PostMapping("/agregar")
    public Ofertas agregar(@RequestBody Ofertas ofertas){
       return repo.save(ofertas); 
    }
    
    @GetMapping("/consultar")
    public List<Ofertas> consultar(){
        return repo.findAll();
    }
    
    @GetMapping("/consultar-ofertas/{id}")
    public Optional<Ofertas> consultarOfertas(@PathVariable Integer id){
        return repo.findById(id);
    }
    
    @PutMapping("/actualizar")
    public Ofertas actualizarOferta(@RequestBody Ofertas id){
       return repo.save(id);
           
    }
}
