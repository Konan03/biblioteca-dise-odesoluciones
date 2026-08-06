package model;

import java.time.LocalDate;

public abstract class Usuario {

    private int id;
    private String nombre;
    private String tipoIdentificacion;
    private String noIdentificacion;
    private int edad;
    private LocalDate fechaNacimiento;
    private String genero;

    public Usuario(int id, String nombre, String tipoIdentificacion,
                   String noIdentificacion, int edad, LocalDate fechaNacimiento,
                   String genero) {
        this.id = id;
        this.nombre = nombre;
        this.tipoIdentificacion = tipoIdentificacion;
        this.noIdentificacion = noIdentificacion;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNoIdentificacion() {
        return noIdentificacion;
    }

    public void setNoIdentificacion(String noIdentificacion) {
        this.noIdentificacion = noIdentificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipoIdentificacion='" + tipoIdentificacion + '\'' +
                ", noIdentificacion='" + noIdentificacion + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                ", genero='" + genero + '\'' +
                '}';
    }
}
