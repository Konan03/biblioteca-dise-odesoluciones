package model;

import java.time.LocalDate;

public class Estudiante extends Usuario implements IActualizableUsuario {

    private String codigoEstudiante;
    private String programaAcademico;
    private int semestre;

    public Estudiante(int id, String nombre, String tipoIdentificacion, String noIdentificacion, int edad, LocalDate fechaNacimiento, String genero, String codigoEstudiante, String programaAcademico, int semestre) {
        super(id, nombre, tipoIdentificacion, noIdentificacion, edad, fechaNacimiento, genero);
        this.codigoEstudiante = codigoEstudiante;
        this.programaAcademico = programaAcademico;
        this.semestre = semestre;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public void actualizarDatos(Usuario usuario) {
        if (usuario instanceof Estudiante) {

            Estudiante estudiante =
                    (Estudiante) usuario;

            this.codigoEstudiante =
                    estudiante.getCodigoEstudiante();

            this.programaAcademico =
                    estudiante.getProgramaAcademico();

            this.semestre =
                    estudiante.getSemestre();
        }
    }
}
