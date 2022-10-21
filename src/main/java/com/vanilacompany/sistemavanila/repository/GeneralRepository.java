/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.repository;

import com.vanilacompany.sistemavanila.modelo.DetalleProductosSolicitud;
import com.vanilacompany.sistemavanila.modelo.ReporteAdministradores;
import com.vanilacompany.sistemavanila.modelo.DireccionUsuario;
import com.vanilacompany.sistemavanila.modelo.Municipio;
import com.vanilacompany.sistemavanila.modelo.ReportePedidosActivos;
import com.vanilacompany.sistemavanila.modelo.ReportePedidosByUsuario;
import com.vanilacompany.sistemavanila.modelo.ReporteUsuarios;
import com.vanilacompany.sistemavanila.modelo.numeroGestion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Esteban Castillo
 */
@Repository
public class GeneralRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<ReporteAdministradores> obtenerReporteAdministradores() {
        String query = "SELECT * FROM sistema_vanila.sv_reporte_administradores";
        Query q = entityManager.createNativeQuery(query, ReporteAdministradores.class);
        return q.getResultList();
    }

    public List<DireccionUsuario> obtenerDireccionByUsuario(String usuario) {
        String query = "select sd.id, sd.nombre, sm.nombre municipio, sdep.nombre departamento, sd.usuario\n"
                + "from sv_direccion sd \n"
                + "inner join sv_municipio sm on sm.id = sd.municipio\n"
                + "inner join sv_departamento sdep on sdep.id = sd.departamento\n"
                + "where sd.usuario = :usuario";
        Query q = entityManager.createNativeQuery(query, DireccionUsuario.class);
        q.setParameter("usuario", usuario);
        return q.getResultList();
    }

    public List<Municipio> obtenerMunicipiosByDepartamento(int id) {
        String query = "select * \n"
                + "from sv_municipio\n"
                + "where departamento = :id";
        Query q = entityManager.createNativeQuery(query, Municipio.class);
        q.setParameter("id", id);
        return q.getResultList();
    }

    public numeroGestion obtenerNumeroGestion() {
        String query = "select ss.numerogestion from sv_solicitud ss order by numerogestion desc limit 1";
        Query q = entityManager.createNativeQuery(query, numeroGestion.class);
        return (numeroGestion) q.getSingleResult();
    }

    public List<ReportePedidosByUsuario> obtenerPedidosByUsuario(String usuario) {
        String query = "select ss.numerogestion, ss.total, \n"
                + "ss.fecha_solicitud, se.descripcion estado, \n"
                + "sd.nombre descripcion, sm.nombre municipio, sdep.nombre departamento\n"
                + "from sv_solicitud ss\n"
                + "inner join sv_estado se on se.id = ss.estado\n"
                + "inner join sv_direccion sd on sd.id = ss.direccion\n"
                + "inner join sv_municipio sm on sm.id = sd.municipio\n"
                + "inner join sv_departamento sdep on sdep.id = sd.departamento\n"
                + "where ss.usuario = :usuario";
        Query q = entityManager.createNativeQuery(query, ReportePedidosByUsuario.class);
        q.setParameter("usuario", usuario);
        return q.getResultList();
    }

    public List<DetalleProductosSolicitud> obtenerDetalleProductosSolicitud(int numerogestion) {
        String query = "select sps.id, sp.nombre producto, sps.cantidad, sps.precio from sv_producto_solicitados sps\n"
                + "inner join sv_producto sp on sp.id = sps.producto\n"
                + "where sps.numerogestion = :numerogestion";
        Query q = entityManager.createNativeQuery(query, DetalleProductosSolicitud.class);
        q.setParameter("numerogestion", numerogestion);
        return q.getResultList();
    }

    public List<ReportePedidosActivos> obtenerPedidosActivos() {
        String query = "select ss.numerogestion, ss.usuario, ss.total, \n"
                + "ss.fecha_solicitud, ss.aplica_oferta,\n"
                + "sd.nombre descripcion, sm.nombre municipio, sdep.nombre departamento, se.descripcion estado\n"
                + "from sv_solicitud ss\n"
                + "inner join sv_estado se on se.id = ss.estado\n"
                + "inner join sv_direccion sd on sd.id = ss.direccion\n"
                + "inner join sv_municipio sm on sm.id = sd.municipio\n"
                + "inner join sv_departamento sdep on sdep.id = sd.departamento\n"
                + "where (ss.estado = 1 || ss.estado = 3)";
        Query q = entityManager.createNativeQuery(query, ReportePedidosActivos.class);
        return q.getResultList();
    }
    
    public List<ReporteUsuarios> obtenerReporteUsuarios() {
        String query = "select su.usuario, su.nombre, su.apellido, su.telefono, su.rol from sv_usuario su";
        Query q = entityManager.createNativeQuery(query, ReporteUsuarios.class);
        return q.getResultList();
    }
}
