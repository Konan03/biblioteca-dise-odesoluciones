package Controller;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();;


    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}
