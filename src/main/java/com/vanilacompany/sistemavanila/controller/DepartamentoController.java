/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.controller;

import com.vanilacompany.sistemavanila.modelo.Departamento;
import com.vanilacompany.sistemavanila.repository.DepartamentoRepository;
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
    @RequestMapping(path="/departamento")
public class DepartamentoController {
    @Autowired
    private DepartamentoRepository repo;
    
    @PostMapping("/agregar")
    public Departamento agregar(@RequestBody Departamento departamento){
       return repo.save(departamento); 
    }
    
    @GetMapping("/consultar")
    public List<Departamento> consultar(){
        return repo.findAll();
    }
    
    @GetMapping("/consultar-departamento/{id}")
    public Optional<Departamento> consultarDepartamento(@PathVariable Integer id){
        return repo.findById(id);
    }
    
    @PutMapping("/actualizar")
    public Departamento actualizarProductoSolicitado(@RequestBody Departamento id){
       return repo.save(id);
    }
}
