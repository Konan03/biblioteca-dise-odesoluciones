package model;

import java.time.LocalDate;

public class EmpresaBiblioteca {

    private static EmpresaBiblioteca empresaBiblioteca;
    private String razonSocial;
    private LocalDate fechaFuncacion;
    private String nit;

    private EmpresaBiblioteca(){

    }

    public static EmpresaBiblioteca getEmpresa(){
        if(empresaBiblioteca == null){
            empresaBiblioteca = new EmpresaBiblioteca();
            empresaBiblioteca.setRazonSocial("Razon social");
            empresaBiblioteca.setNit("100879459-0");
            empresaBiblioteca.setFechaFuncacion(LocalDate.now());
        }
        return empresaBiblioteca;
    }

    public static EmpresaBiblioteca getEmpresaBiblioteca() {
        return empresaBiblioteca;
    }

    public static void setEmpresaBiblioteca(EmpresaBiblioteca empresaBiblioteca) {
        EmpresaBiblioteca.empresaBiblioteca = empresaBiblioteca;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public LocalDate getFechaFuncacion() {
        return fechaFuncacion;
    }

    public void setFechaFuncacion(LocalDate fechaFuncacion) {
        this.fechaFuncacion = fechaFuncacion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "EmpresaBiblioteca{" +
                "razonSocial='" + razonSocial + '\'' +
                ", fechaFuncacion=" + fechaFuncacion +
                ", nit='" + nit + '\'' +
                '}';
    }
}
