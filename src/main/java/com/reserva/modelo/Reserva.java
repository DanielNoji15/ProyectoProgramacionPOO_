package modelo;

public class Reserva {
    private int id;
    private UsuarioCliente cliente;
    private Negocio negocio;

    public Reserva(int id, UsuarioCliente cliente, Negocio negocio) {
        this.id = id;
        this.cliente = cliente;
        this.negocio = negocio;
    }

    public int getId() {
        return id;
    }

    public UsuarioCliente getCliente() {
        return cliente;
    }

    public Negocio getNegocio() {
        return negocio;
    }

    public String mostrarInformacion() {
        return "Reserva " + id + ": Cliente " + cliente.getNombre() + " en " + negocio.getNombre();
    }
}