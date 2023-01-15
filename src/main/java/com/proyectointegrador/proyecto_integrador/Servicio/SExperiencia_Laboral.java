package com.proyectointegrador.proyecto_integrador.Servicio;

import com.proyectointegrador.proyecto_integrador.Entidad.Experiencia_Laboral;
import com.proyectointegrador.proyecto_integrador.Repositorio.RExperiencia_Laboral;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia_Laboral {
    @Autowired
    RExperiencia_Laboral rExperiencia_Laboral;
    
    public List<Experiencia_Laboral> list(){
        return rExperiencia_Laboral.findAll();
    }
    
    public Optional<Experiencia_Laboral> getOne(int id){
        return rExperiencia_Laboral.findById(id);
    }
    
    public Optional<Experiencia_Laboral> getByNombreE(String nombreE){
        return rExperiencia_Laboral.findByNombreE(nombreE);
    }
    
    public void save(Experiencia_Laboral expe){
        rExperiencia_Laboral.save(expe);
    }
    
    public void delete(int id){
        rExperiencia_Laboral.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rExperiencia_Laboral.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return rExperiencia_Laboral.existsByNombreE(nombreE);
    }
}

