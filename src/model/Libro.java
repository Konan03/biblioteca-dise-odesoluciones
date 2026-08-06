package model;

public class Libro {

    private int id;
    private String nombre;
    private String editorial;
    private String autor;
    private String isbn;
    private String material;
    private boolean estado;

    public Libro(int id, String nombre, String editorial,
                 String autor, String isbn, String material, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.editorial = editorial;
        this.autor = autor;
        this.isbn = isbn;
        this.material = material;
        this.estado = estado;
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", editorial='" + editorial + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", material='" + material + '\'' +
                ", estado=" + estado +
                '}';
    }
}
