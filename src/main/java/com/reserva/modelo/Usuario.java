package modelo;

public abstract class Usuario {
    protected int id;
    protected String nombre;
    protected String correo;

    public Usuario(int id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public abstract String getTipoUsuario();
    public abstract String mostrarInformacion();
}