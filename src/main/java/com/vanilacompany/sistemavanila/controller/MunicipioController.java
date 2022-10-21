/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.controller;

import com.vanilacompany.sistemavanila.modelo.DireccionUsuario;
import com.vanilacompany.sistemavanila.modelo.Municipio;
import com.vanilacompany.sistemavanila.repository.GeneralRepository;
import com.vanilacompany.sistemavanila.repository.MunicipioRepository;
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
    @RequestMapping(path="/municipio")
public class MunicipioController {
    @Autowired
    private MunicipioRepository repo;
    
    @Autowired
    private GeneralRepository general;
     
    @PostMapping("/agregar")
    public Municipio agregar(@RequestBody Municipio municipio){
       return repo.save(municipio); 
    }
    
    @GetMapping("/consultar")
    public List<Municipio> consultar(){
        return repo.findAll();
    }
    
    @GetMapping("/consultar-municipio/{id}")
    public Optional<Municipio> consultarMunicipio(@PathVariable Integer id){
        return repo.findById(id);
    }
    
    @PutMapping("/actualizar")
    public Municipio actualizarMunicipio(@RequestBody Municipio id){
       return repo.save(id); 
    }
    
    @GetMapping("/municipios/{id}")
    public List<Municipio> reporteMunicipiosByDepartamento(@PathVariable int id){
        List<Municipio> reporte = general.obtenerMunicipiosByDepartamento(id);
        return reporte;
    }
}
