package observer;

import model.Prestamo;

public class AuditoriaPrestamo implements PrestamoObserver {

    @Override
    public void actualizar(Prestamo prestamo) {

        System.out.println(
                "AUDITORÍA: Se registró un préstamo del libro "
                        + prestamo.getLibro().getNombre()
        );

    }
}