package model;

import java.time.LocalDate;

public class Estudiante extends Usuario{

    public Estudiante(int id, String nombre, String tipoIdentificacion, String noIdentificacion, int edad, LocalDate fechaNacimiento, String genero) {
        super(id, nombre, tipoIdentificacion, noIdentificacion, edad, fechaNacimiento, genero);
    }
}
