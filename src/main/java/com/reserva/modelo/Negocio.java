package modelo;

import java.util.ArrayList;
import java.util.List;

public class Negocio {
    private int id;
    private String nombre;
    private UsuarioAdmin propietario;
    private Direccion direccion;
    private List<Categoria> categorias;

    public Negocio(int id, String nombre, UsuarioAdmin propietario, Direccion direccion) {
        validarNombre(nombre);
        validarPropietario(propietario);
        validarDireccion(direccion);
        this.id = id;
        this.nombre = nombre;
        this.propietario = propietario;
        this.direccion = direccion;
        this.categorias = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
    }

    public UsuarioAdmin getPropietario() {
        return propietario;
    }

    public void setPropietario(UsuarioAdmin propietario) {
        validarPropietario(propietario);
        this.propietario = propietario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        validarDireccion(direccion);
        this.direccion = direccion;
    }

    public List<Categoria> getCategorias() {
        return new ArrayList<>(categorias); // Devuelve una copia para evitar modificaciones directas
    }

    public void addCategoria(Categoria categoria) {
        if (categoria != null && !categorias.contains(categoria)) {
            categorias.add(categoria);
        }
    }

    public String mostrarInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("Negocio: ").append(nombre).append("\n");
        info.append("Propietario: ").append(propietario.getNombre()).append("\n");
        info.append("Dirección: ").append(direccion.toString()).append("\n");
        info.append("Categorías: ");
        if (categorias.isEmpty()) {
            info.append("Ninguna\n");
        } else {
            for (Categoria c : categorias) {
                info.append(c.toString()).append(", ");
            }
            info.setLength(info.length() - 2); // Eliminar última coma y espacio
            info.append("\n");
        }
        return info.toString();
    }

    private void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del negocio no puede estar vacío.");
        }
    }

    private void validarPropietario(UsuarioAdmin propietario) {
        if (propietario == null) {
            throw new IllegalArgumentException("El propietario no puede ser nulo.");
        }
    }

    private void validarDireccion(Direccion direccion) {
        if (direccion == null) {
            throw new IllegalArgumentException("La dirección no puede ser nula.");
        }
    }
}