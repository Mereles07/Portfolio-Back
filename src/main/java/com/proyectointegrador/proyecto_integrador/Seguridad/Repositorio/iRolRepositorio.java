package com.proyectointegrador.proyecto_integrador.Seguridad.Repositorio;

import com.proyectointegrador.proyecto_integrador.Seguridad.Entidad.Rol;
import com.proyectointegrador.proyecto_integrador.Seguridad.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepositorio extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}

