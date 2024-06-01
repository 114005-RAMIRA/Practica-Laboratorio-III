package Clase31_5.Ejemplo.service;

//aqui tendremos nuestra logica de negocio
//tendremos implementaciones de esta interfaz que haran distintas cosas

import Clase31_5.Ejemplo.domain.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {

    Persona insertarPersona(Persona persona); //por lo general cuando insertamos datos vamos a recuperar
    List<Persona> buscarTodos(); // va a ser un select *
    Persona buscarPersona(String nombre);
    Optional<Persona> buscarPersona(Long id);
    void borrarPersona(Long id);
    Persona actualizarPersona(Long id, Persona persona);

}
