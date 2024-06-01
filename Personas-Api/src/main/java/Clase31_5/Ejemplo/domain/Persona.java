package Clase31_5.Ejemplo.domain;


import jakarta.persistence.*; //para olvidarnos de importar todos
import lombok.Data;
import lombok.Getter;


@Entity //como le decimos a spring que esa clase se tiene que modelar en una tabla se ahce con @entity
@Table(name="personas") //sirve para definir el nombre que quiero darle a la tabla se recomienta que sea el mismo nombre de la base de datos genera los beans
@Data //si modelamos una clase que tiene atriv privamos vamos a necesitar los geters y seters, gracias a longboc



public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //genera un campo como identity

    private Long id;

    //para el resto de los valores usamos @Column

    @Column(name = "name") //si yo no le pongo nada por defecto va a tomar nombre
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="edad")
    private int edad;
}

