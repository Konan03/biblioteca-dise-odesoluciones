package Controller;

import model.IActualizableUsuario;
import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {

    private static List<Usuario> usuarios = new ArrayList<>();;

    public static void agregarUsuario(Usuario usuario) throws RuntimeException{
        if(usuario != null){
            if(usuario.validarUsuario()){
                if(!existeId(usuario.getId())){
                    usuarios.add(usuario);
                    System.out.println("Usuario agregado correctamente");
                }else{
                    throw new RuntimeException("Error: Ya existe un usuario con ese ID");
                }
            }else{
                throw new RuntimeException("Error: campos invalidos para el usuario");
            }
        }else{
            throw new RuntimeException("Error: usuario nulo");
        }
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    private static boolean existeId(int id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void eliminarUsuario(int id){
        for(Usuario usuario : usuarios){
            if(usuario.getId() == id){
                usuarios.remove(usuario);
                System.out.println("Usuario eliminado correctamente");
                return;
            }
        }
        System.out.println("No se encontro ningun usuario con ese ID");
    }

    public static void eliminarUsuario(String nombre) {
        usuarios.removeIf(usuario -> nombre.equalsIgnoreCase(usuario.getNombre()));
    }

    public static Usuario buscarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public static Usuario buscarUsuario(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombre)) {
                return usuario;
            }
        }
        return null;
    }

    public static void actualizarUsuario(Usuario usuario){
        boolean actualizo = false;
        for (Usuario u : usuarios){
            if(u.getId() == usuario.getId()){
                u.setNombre(usuario.getNombre());
                u.setId(usuario.getId());
                u.setFechaNacimiento(usuario.getFechaNacimiento());
                u.setEdad(usuario.getEdad());
                u.setGenero(usuario.getGenero());
                u.setNoIdentificacion(usuario.getNoIdentificacion());
                u.setTipoIdentificacion(usuario.getTipoIdentificacion());

                // Datos específicos del subtipo
                if (u instanceof IActualizableUsuario) {
                    IActualizableUsuario actualizable = (IActualizableUsuario) u;
                    actualizable.actualizarDatos(usuario);
                }


                System.out.println("Usuario actualizado");
                actualizo = true;
                break;
            }
        }
        System.out.println("No se encontro un usuario con es ID");
    }
}
