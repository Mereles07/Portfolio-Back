package com.proyectointegrador.proyecto_integrador.Seguridad.Servicio;

import com.proyectointegrador.proyecto_integrador.Seguridad.Entidad.Rol;
import com.proyectointegrador.proyecto_integrador.Seguridad.Enums.RolNombre;
import com.proyectointegrador.proyecto_integrador.Seguridad.Repositorio.iRolRepositorio;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolServicio {
    @Autowired
    iRolRepositorio irolRepositorio;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepositorio.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepositorio.save(rol);
    }
}