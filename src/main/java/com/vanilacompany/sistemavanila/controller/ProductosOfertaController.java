/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.controller;

import com.vanilacompany.sistemavanila.modelo.ProductosOferta;
import com.vanilacompany.sistemavanila.repository.ProductosOfertaRepository;
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
    @RequestMapping(path="/productos-oferta")
public class ProductosOfertaController {
    @Autowired
    private ProductosOfertaRepository repo;
    
    @PostMapping("/agregar")
    public ProductosOferta agregar(@RequestBody ProductosOferta productoOferta){
       return repo.save(productoOferta); 
    }
    
    @GetMapping("/consultar")
    public List<ProductosOferta> consultar(){
        return repo.findAll();
    }
    
    @GetMapping("/consultar-ofertas/{id}")
    public Optional<ProductosOferta> consultarProductosOfertas(@PathVariable Integer id){
        return repo.findById(id);
    }
    
    @PutMapping("/actualizar")
    public ProductosOferta actualizarProductosOferta(@RequestBody ProductosOferta id){
       return repo.save(id);
           
    }
}
