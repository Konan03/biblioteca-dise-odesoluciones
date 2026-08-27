package observer;

import model.Prestamo;

public class NotificacionPrestamo implements PrestamoObserver {

    //10. ¿Y qué significa actualizar()?
    // //No significa necesariamente "actualizar un préstamo".
    // //Ese nombre viene del patrón Observer. //
    // Significa algo más parecido a:
    // //"Me avisaron que ocurrió algo, voy a reaccionar."
    @Override
    public void actualizar(Prestamo prestamo) {

        System.out.println(
                "NOTIFICACIÓN: Se realizó un préstamo para "
                        + prestamo.getEstudiante().getNombre()
        );

    }
}