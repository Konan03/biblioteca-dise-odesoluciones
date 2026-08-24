package Controller;

import model.Prestamo;

import java.util.ArrayList;
import java.util.List;

public class PrestamoController {

    private List<Prestamo> prestamos;

    public PrestamoController() {
        prestamos = new ArrayList<>();
    }

    public void crearPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public List<Prestamo> listarPrestamos() {
        return prestamos;
    }

    public void eliminarPrestamo(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }
}