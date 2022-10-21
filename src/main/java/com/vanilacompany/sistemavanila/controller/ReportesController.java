/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.controller;

import com.vanilacompany.sistemavanila.modelo.DetalleProductosSolicitud;
import com.vanilacompany.sistemavanila.modelo.ReporteAdministradores;
import com.vanilacompany.sistemavanila.modelo.ReportePedidosActivos;
import com.vanilacompany.sistemavanila.modelo.ReportePedidosByUsuario;
import com.vanilacompany.sistemavanila.modelo.ReporteUsuarios;
import com.vanilacompany.sistemavanila.repository.GeneralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Esteban Castillo
 */
//@CrossOrigin(origins ="https://sistema-vanila.azurewebsites.net")
@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping(path="/reportes")
public class ReportesController {
    
    @Autowired
    private GeneralRepository general;
    
    @GetMapping("/reporte-administradores")
    public List<ReporteAdministradores> reporteAdministradores(){
        List<ReporteAdministradores> reporte = general.obtenerReporteAdministradores();
        return reporte;
    }
    
    @GetMapping("/reporte-pedidos/{usuario}")
    public List<ReportePedidosByUsuario> reportePedidosByUsuario(@PathVariable String usuario){
        List<ReportePedidosByUsuario> reporte = general.obtenerPedidosByUsuario(usuario);
        return reporte;
    }
    
    @GetMapping("/detalle-solicitud/{numerogestion}")
    public List<DetalleProductosSolicitud> reporteDetalleSolicitud(@PathVariable int numerogestion){
        List<DetalleProductosSolicitud> reporte = general.obtenerDetalleProductosSolicitud(numerogestion);
        return reporte;
    }
    
    @GetMapping("/reporte-solicitudes-activas")
    public List<ReportePedidosActivos> reporteSolicitudesActivas(){
        List<ReportePedidosActivos> reporte = general.obtenerPedidosActivos();
        return reporte;
    }
    
    @GetMapping("/reporte-usuarios")
    public List<ReporteUsuarios> reporteUsuarios(){
        List<ReporteUsuarios> reporte = general.obtenerReporteUsuarios();
        return reporte;
    }
}
