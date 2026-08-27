import Controller.PrestamoController;
import Controller.UsuarioController;
import model.Biblioteca;
import model.Estudiante;
import model.Libro;
import model.Prestamo;
import observer.AuditoriaPrestamo;
import observer.NotificacionPrestamo;
import view.GUIPrincipal;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = Biblioteca.getEmpresa();
        UsuarioController usuarioController = new UsuarioController();
        GUIPrincipal guiPrincipal = new GUIPrincipal(biblioteca);

        Estudiante estudiante1 = new Estudiante(1, "Manuel Caicedo",
                "CC", "12345678", 22, LocalDate.of(2003, 10, 14), "M",
                "2220201002", "Ing sistemas", 10);

        Libro libro1 = new Libro(1, "Harry Potter", "Editorial XD",
                "JKR", "123asd", "Pasta dura", true);


        usuarioController.agregarUsuario(estudiante1);
        System.out.println(usuarioController.listarUsuarios());

        PrestamoController prestamoController = new PrestamoController();

        //para observer
        NotificacionPrestamo notificacion = new NotificacionPrestamo();
        AuditoriaPrestamo auditoria = new AuditoriaPrestamo();
        prestamoController.suscribir(notificacion);
        prestamoController.suscribir(auditoria);




        Prestamo prestamo1 = new Prestamo(
                LocalDate.now(),
                estudiante1,
                LocalDate.now().plusDays(7),
                libro1
        );

        prestamoController.crearPrestamo(prestamo1);
        System.out.println(prestamoController.listarPrestamos());



    }
}





