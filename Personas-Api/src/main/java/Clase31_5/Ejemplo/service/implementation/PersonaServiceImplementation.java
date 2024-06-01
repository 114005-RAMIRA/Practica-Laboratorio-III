package Clase31_5.Ejemplo.service.implementation;

import Clase31_5.Ejemplo.domain.Persona;
import Clase31_5.Ejemplo.repository.PersonaRepository;
import Clase31_5.Ejemplo.service.PersonaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonaServiceImplementation implements PersonaService {

    //podemos tener una implementacion que use distintos repositorios
    //todos ellos van a tener su inicializacion en el repositorio


    private final PersonaRepository personaRepository;

    public PersonaServiceImplementation(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }


    @Override
    public Persona insertarPersona(Persona persona) {

        return personaRepository.save(persona); // insert into persona hacemos la persistencia

    }

    @Override
    public List<Persona> buscarTodos() {

      return personaRepository.findAll();

    }

    @Override
    public Persona buscarPersona(String nombre) {

       return personaRepository.findByNombre(nombre); //necesitaremos uno personalizado

    }

    @Override
    public Optional<Persona> buscarPersona(Long id) {

        return personaRepository.findById(id);
    }

    @Override
    public void borrarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona persona) {
        //primero haremos la busqueda del objeto, si existe lo actualizamos

        Optional<Persona> base = personaRepository.findById(id);

        if (base.isPresent()) {
            base.get().setNombre(persona.getNombre());
            base.get().setApellido(persona.getApellido());
            base.get().setEdad(persona.getEdad());
            return personaRepository.save(base.get());
        }
        else{
            return personaRepository.save(base.get());
        }


    }
}
