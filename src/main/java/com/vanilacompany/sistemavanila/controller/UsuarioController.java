/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.controller;
import com.vanilacompany.sistemavanila.modelo.User;
import com.vanilacompany.sistemavanila.repository.UserRepository;
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
//@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping(path="/usuario")
public class UsuarioController {
    
    @Autowired
    private UserRepository repo;
    
    @PostMapping("/agregar")
    public User agregar(@RequestBody User usuario){
       return repo.save(usuario); 
    }
    
    @GetMapping("/consultar")
    public List<User> consultar(){
        return repo.findAll();
    }
    
    @GetMapping("/consultar-usuario/{usuario}")
    public Optional<User> consultarUsuario(@PathVariable String usuario){
        return repo.findById(usuario);
    }
    
    @PutMapping("/actualizar")
    public User actualizarUsuario(@RequestBody User usuario){
       return repo.save(usuario); 
    }
    
}
