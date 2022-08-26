package com.portfolio.casulo.Interface;

import com.portfolio.casulo.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Para traer una persona
    public List<Persona> getPersona();
    //Para guardar un objeto de tipo persona
    public void savePersona(Persona persona);          
    //Para eliminar un usuario buscando por ID
    public void deletePersona(Long id);
    //Para buscar una persona por ID
    public Persona findPersona(Long id);
}
