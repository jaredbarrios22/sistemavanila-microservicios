/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.controller;

import com.vanilacompany.sistemavanila.modelo.Productos;
import com.vanilacompany.sistemavanila.repository.ProductosRepository;
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
    @RequestMapping(path="/producto")
    
public class ProductosController {
    @Autowired
    private ProductosRepository repo;
    
    @PostMapping("/agregar")
    public Productos agregar(@RequestBody Productos productos){
       return repo.save(productos); 
    }
    
    @GetMapping("/consultar")
    public List<Productos> consultar(){
        return repo.findAll();
    }
    
    @GetMapping("/consultar-producto/{productos}")
    public Optional<Productos> consultarUsuario(@PathVariable Integer productos){
        return repo.findById(productos);
    }
    
    @PutMapping("/actualizar")
    public Productos actualizarUsuario(@RequestBody Productos productos){
       return repo.save(productos); 
    }
}
