/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.controller;

import com.vanilacompany.sistemavanila.modelo.ProductoSolicitado;
import com.vanilacompany.sistemavanila.repository.ProductoSolicitadoRepository;
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
@CrossOrigin(origins ="https://sistema-vanila.azurewebsites.net")
//    @CrossOrigin(origins ="http://localhost:4200")
    @RestController
    @RequestMapping(path="/producto-solicitado")
public class ProductoSolicitadoController {
        
    @Autowired
    private ProductoSolicitadoRepository repo;
    
    @PostMapping("/agregar")
    public ProductoSolicitado agregar(@RequestBody ProductoSolicitado productoSolicitado){
       return repo.save(productoSolicitado); 
    }
    
    @GetMapping("/consultar")
    public List<ProductoSolicitado> consultar(){
        return repo.findAll();
    }
    
    @GetMapping("/consultar-productos-solicitados/{numerogestion}")
    public Optional<ProductoSolicitado> consultarProductoSolicitado(@PathVariable Integer numerogestion){
        return repo.findById(numerogestion);
    }
    
    @PutMapping("/actualizar")
    public ProductoSolicitado actualizarProductoSolicitado(@RequestBody ProductoSolicitado numerogestion){
       return repo.save(numerogestion);
           
    }
}
