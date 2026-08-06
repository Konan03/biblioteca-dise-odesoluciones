package model;

import java.time.LocalDate;

public class Prestamo {

    private LocalDate fechaPrestamo;
    private Estudiante estudiante;
    private LocalDate fechaDevolucion;
    private Libro libro;

    public Prestamo(LocalDate fechaPrestamo, Estudiante estudiante,
                    LocalDate fechaDevolucion, Libro libro) {
        this.fechaPrestamo = fechaPrestamo;
        this.estudiante = estudiante;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaPrestamo=" + fechaPrestamo +
                ", estudiante=" + estudiante +
                ", fechaDevolucion=" + fechaDevolucion +
                ", libro=" + libro +
                '}';
    }
}
