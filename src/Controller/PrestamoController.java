package Controller;

import model.Prestamo;
import observer.PrestamoObserver;

import java.util.ArrayList;
import java.util.List;

public class PrestamoController {

    private List<Prestamo> prestamos = new ArrayList<>();

    //observer
    //List<Prestamo>
    //    ↓
    //Los préstamos registrados
    //
    //
    //List<PrestamoObserver>
    //    ↓
    //Los objetos interesados en los préstamos
    private List<PrestamoObserver> observers = new ArrayList<>();

    public void crearPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);


        //sin observer tocarua recurrir a esto
        //  System.out.println("Préstamo creado");
        //
        //    System.out.println(
        //            "Notificando a "
        //            + prestamo.getEstudiante().getNombre()
        //    );
        //
        //    System.out.println(
        //            "Registrando préstamo en auditoría"
        //    );


        //agregamos esto para el observer
        notificar(prestamo);
    }

    public List<Prestamo> listarPrestamos() {
        return prestamos;
    }

    public void eliminarPrestamo(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }


    //metodos del observer
    public void suscribir(PrestamoObserver observer) {

        observers.add(observer);

    }

    public void desuscribir(PrestamoObserver observer) {

        observers.remove(observer);

    }

    private void notificar(Prestamo prestamo) {

        for (PrestamoObserver observer : observers) {

            observer.actualizar(prestamo);

        }

    }
}