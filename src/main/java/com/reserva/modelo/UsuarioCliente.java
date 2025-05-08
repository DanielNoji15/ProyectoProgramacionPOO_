package modelo;

public class UsuarioCliente extends Usuario {
    public UsuarioCliente(int id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    @Override
    public String getTipoUsuario() {
        return "Cliente";
    }

    @Override
    public String mostrarInformacion() {
        return "Cliente: " + nombre + ", Correo: " + correo;
    }
}