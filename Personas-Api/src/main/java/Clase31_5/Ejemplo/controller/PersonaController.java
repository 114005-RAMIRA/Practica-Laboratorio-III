package Clase31_5.Ejemplo.controller;


import Clase31_5.Ejemplo.domain.Persona;
import Clase31_5.Ejemplo.service.PersonaService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")//tenemos que establecer la ruta raiz
public class PersonaController {

   private final PersonaService personaService;



    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping ("/persona") //le decimo cual es la ruta que tiene que seguir

    public ResponseEntity<Persona> savePersona(@RequestBody Persona persona) { //request body es un json
        Persona result = personaService.insertarPersona(persona);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(result);
    }

    @GetMapping("/persona/all")
    public List<Persona> findAllPersona(){
        return personaService.buscarTodos();
    }

    @GetMapping("/persona")

    public Persona findByNombre(@RequestParam String nombre){ //request param nos permite que en la url hacemos el query string
        return personaService.buscarPersona(nombre);
    }

    @DeleteMapping("/persona/{id}")
    public ResponseEntity<Persona> deletePersona(@PathVariable Long id){// path variable toma lo que esta entre llaves y lo guarda en una variale
        personaService.borrarPersona(id);
        return ResponseEntity.ok(null);
    }


    @PutMapping("/persona/{id}")
    public Persona updatePersona(@PathVariable Long id, @RequestBody Persona persona){
        return personaService.actualizarPersona(id, persona);

    }

}

