/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.controller;

import com.vanilacompany.sistemavanila.modelo.Solicitud;
import com.vanilacompany.sistemavanila.modelo.numeroGestion;
import com.vanilacompany.sistemavanila.repository.GeneralRepository;
import com.vanilacompany.sistemavanila.repository.SolicitudRepository;
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
    @RequestMapping(path="/solicitud")
public class SolicitudController {
    
    @Autowired
    private SolicitudRepository repo;
    
    @Autowired
    private GeneralRepository general;
    
    @PostMapping("/agregar")
    public Solicitud agregar(@RequestBody Solicitud solicitudes){
       return repo.save(solicitudes); 
    }
    
    @GetMapping("/consultar")
    public List<Solicitud> consultar(){
        return repo.findAll();
    }
    
    @GetMapping("/consultar-solicitud/{numerogestion}")
    public Optional<Solicitud> consultarSolicitud(@PathVariable Integer numerogestion){
        return repo.findById(numerogestion);
    }
    
    @PutMapping("/actualizar")
    public Solicitud actualizarSolicitud(@RequestBody Solicitud numerogestion){
       return repo.save(numerogestion); 
    }
    
    @GetMapping("/numeroGestion")
    public numeroGestion obtenerNumeroGestion(){
        numeroGestion reporte = general.obtenerNumeroGestion();
        return reporte;
    }
}
