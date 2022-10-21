/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.controller;

import com.vanilacompany.sistemavanila.modelo.Direccion;
import com.vanilacompany.sistemavanila.modelo.DireccionUsuario;
import com.vanilacompany.sistemavanila.repository.DireccionRepository;
import com.vanilacompany.sistemavanila.repository.GeneralRepository;
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
    @RequestMapping(path="/direccion")
public class DireccionController {
        
    @Autowired
    private DireccionRepository repo;
    
    @Autowired
    private GeneralRepository general;
    
    @PostMapping("/agregar")
    public Direccion agregar(@RequestBody Direccion direccion){
       return repo.save(direccion); 
    }
    
    @GetMapping("/consultar")
    public List<Direccion> consultar(){
        return repo.findAll();
    }
    
    @GetMapping("/consultar-direccion/{id}")
    public Optional<Direccion> consultarDireccion(@PathVariable Integer id){
        return repo.findById(id);
    }
    
    @PutMapping("/actualizar")
    public Direccion actualizarDireccion(@RequestBody Direccion id){
       return repo.save(id);
           
    }
    
    @GetMapping("/direccion/{usuario}")
    public List<DireccionUsuario> reporteAdministradores(@PathVariable String usuario){
        List<DireccionUsuario> reporte = general.obtenerDireccionByUsuario(usuario);
        return reporte;
    }
}
