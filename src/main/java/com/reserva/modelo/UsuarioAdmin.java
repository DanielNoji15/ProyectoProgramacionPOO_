package modelo;

public class UsuarioAdmin extends Usuario {
    public UsuarioAdmin(int id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    @Override
    public String getTipoUsuario() {
        return "Administrador";
    }

    @Override
    public String mostrarInformacion() {
        return "Administrador: " + nombre + ", Correo: " + correo;
    }
}