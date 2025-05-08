package modelo;

public class Direccion {
    private int id;
    private String ciudad;
    private String calle;
    private String numero;

    public Direccion(int id, String ciudad, String calle, String numero) {
        this.id = id;
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return ciudad + ", " + calle + " " + numero;
    }
}