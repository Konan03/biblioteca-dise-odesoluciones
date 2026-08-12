import Controller.UsuarioController;
import model.Biblioteca;
import model.Estudiante;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = Biblioteca.getEmpresa();
        System.out.println(biblioteca);

        UsuarioController usuarioController = new UsuarioController();

        Estudiante estudiante1 = new Estudiante(1, "Manuel Caicedo",
                "CC", "12345678", 22, LocalDate.of(2003, 10, 14), "M",
                "2220201002", "Ing sistemas", 10);


        usuarioController.agregarUsuario(estudiante1);
        System.out.println(usuarioController.listarUsuarios());
    }




}
