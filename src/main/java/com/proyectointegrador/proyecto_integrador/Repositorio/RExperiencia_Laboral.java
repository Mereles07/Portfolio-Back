package com.proyectointegrador.proyecto_integrador.Repositorio;

import com.proyectointegrador.proyecto_integrador.Entidad.Experiencia_Laboral;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia_Laboral extends JpaRepository<Experiencia_Laboral, Integer> {
    public Optional<Experiencia_Laboral> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}

