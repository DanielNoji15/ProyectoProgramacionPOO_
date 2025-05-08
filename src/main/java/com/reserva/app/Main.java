package app;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        // Instanciar administradores
        UsuarioAdmin admin1 = new UsuarioAdmin(1, "Juan Pérez", "juan@example.com");
        UsuarioAdmin admin2 = new UsuarioAdmin(2, "Ana Rodríguez", "ana@example.com");
        UsuarioAdmin admin3 = new UsuarioAdmin(3, "Carlos López", "carlos@example.com");

        // Instanciar clientes
        UsuarioCliente cliente1 = new UsuarioCliente(1, "María Gómez", "maria@example.com");
        UsuarioCliente cliente2 = new UsuarioCliente(2, "Pedro Sánchez", "pedro@example.com");
        UsuarioCliente cliente3 = new UsuarioCliente(3, "Laura Martínez", "laura@example.com");
        UsuarioCliente cliente4 = new UsuarioCliente(4, "Sofía Ramírez", "sofia@example.com");

        // Instanciar direcciones
        Direccion direccion1 = new Direccion(1, "Bogotá", "Calle 100", "5-10");
        Direccion direccion2 = new Direccion(2, "Medellín", "Avenida 20", "12-34");
        Direccion direccion3 = new Direccion(3, "Cali", "Calle 5", "8-90");
        Direccion direccion4 = new Direccion(4, "Barranquilla", "Carrera 50", "15-23");

        // Instanciar negocios
        Negocio negocio1 = new Negocio(1, "Restaurante El Sabor", admin1, direccion1);
        Negocio negocio2 = new Negocio(2, "Hotel Paraíso", admin2, direccion2);
        Negocio negocio3 = new Negocio(3, "Café Aroma", admin3, direccion3);
        Negocio negocio4 = new Negocio(4, "Bar La Estrella", admin1, direccion4);

        // Instanciar categorías
        Categoria cat1 = new Categoria(1, "Restaurante");
        Categoria cat2 = new Categoria(2, "Comida Rápida");
        Categoria cat3 = new Categoria(3, "Hotel");
        Categoria cat4 = new Categoria(4, "Cafetería");
        Categoria cat5 = new Categoria(5, "Bar");
        Categoria cat6 = new Categoria(6, "Comida Italiana");

        // Asignar categorías a los negocios
        negocio1.addCategoria(cat1);
        negocio1.addCategoria(cat2);
        negocio2.addCategoria(cat3);
        negocio3.addCategoria(cat4);
        negocio3.addCategoria(cat6);
        negocio4.addCategoria(cat5);

        // Instanciar reservas
        Reserva reserva1 = new Reserva(1, cliente1, negocio1);
        Reserva reserva2 = new Reserva(2, cliente2, negocio2);
        Reserva reserva3 = new Reserva(3, cliente3, negocio3);
        Reserva reserva4 = new Reserva(4, cliente4, negocio4);

        // Mostrar información usando polimorfismo
        System.out.println("=== Administradores ===");
        for (UsuarioAdmin admin : new UsuarioAdmin[]{admin1, admin2, admin3}) {
            System.out.println(admin.mostrarInformacion());
        }

        System.out.println("\n=== Clientes ===");
        for (UsuarioCliente cliente : new UsuarioCliente[]{cliente1, cliente2, cliente3, cliente4}) {
            System.out.println(cliente.mostrarInformacion());
        }

        System.out.println("\n=== Negocios ===");
        for (Negocio negocio : new Negocio[]{negocio1, negocio2, negocio3, negocio4}) {
            System.out.println(negocio.mostrarInformacion());
        }

        System.out.println("\n=== Reservas ===");
        for (Reserva reserva : new Reserva[]{reserva1, reserva2, reserva3, reserva4}) {
            System.out.println(reserva.mostrarInformacion());
        }
    }
}