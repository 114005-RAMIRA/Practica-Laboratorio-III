package Clase31_5.Ejemplo.repository;

import org.springframework.stereotype.Repository;
import Clase31_5.Ejemplo.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository //clase que va a trabajar contra la bse de datos
public interface PersonaRepository extends JpaRepository<Persona,Long> { //los parametros <> se relacionaran con la tabla a la que esta accediedo

//vamos a definir metodos con consultas muy especificas

    //para encontrar por nombre
Persona findByNombre(String nombre);


}
