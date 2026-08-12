package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Usuario{

    private String codigoEstudiante;
    private String programaAcademico;
    private int semestre;

    //  ¡Ahora sí recibe los 10 parámetros necesarios!
    public Estudiante(int id, String nombre, String tipoIdentificacion, String noIdentificacion, int edad, LocalDate fechaNacimiento, String genero, String codigoEstudiante, String programaAcademico, int semestre) {
        super(id, nombre, tipoIdentificacion, noIdentificacion, edad, fechaNacimiento, genero);
        this.codigoEstudiante = codigoEstudiante;
        this.programaAcademico = programaAcademico;
        this.semestre = semestre;
    }


    //Tenemos nuestra clase Estudiante.
    //Ahora queremos registrar estudiantes en nuestra biblioteca.
    //¿Dónde guardamos la lista?
    //
    //Porque ahora Estudiante tendría dos responsabilidades:
    //Estudiante
    //│
    //├── representar un estudiante
    //│
    //└── administrar estudiantes
    private static List<Estudiante> estudiantes = new ArrayList<>();

    public void guardar() {
        estudiantes.add(this);
    }

}
