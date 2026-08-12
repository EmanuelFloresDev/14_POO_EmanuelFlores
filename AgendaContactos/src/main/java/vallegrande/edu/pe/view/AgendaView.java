package vallegrande.edu.pe.view;

import vallegrande.edu.pe.model.Contacto;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaView {

    private Scanner scanner;

    // Constructor
    public AgendaView() {
        scanner = new Scanner(System.in);
    }

    // Mostrar título
    public void mostrarTitulo() {
        System.out.println("-----------------------------------");
        System.out.println("        AGENDA DE CONTACTOS");
        System.out.println("-----------------------------------");
    }

    // Mostrar menú
    public void mostrarMenu() {

        System.out.println("\n========= MENU =========");
        System.out.println("1. Registrar contacto");
        System.out.println("2. Listar contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Eliminar contacto");
        System.out.println("5. Salir");
        System.out.println("========================");
    }

    // Leer opción
    public int leerOpcion() {

        System.out.print("Seleccione una opción: ");

        return scanner.nextInt();
    }

    // Leer datos del contacto
    public Contacto ingresarContacto(int id) {

        scanner.nextLine();

        System.out.print("Nombres: ");
        String nombres = scanner.nextLine();

        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Correo electrónico: ");
        String correo = scanner.nextLine();

        return new Contacto(
                id,
                nombres,
                apellidos,
                direccion,
                telefono,
                correo
        );
    }

    // Mostrar lista
    public void mostrarContactos(ArrayList<Contacto> contactos) {

        if (contactos.isEmpty()) {
            System.out.println("\nNo hay contactos registrados.");
            return;
        }

        System.out.println("\n======= LISTA DE CONTACTOS =======");

        for (Contacto contacto : contactos) {
            contacto.mostrarContacto();
        }
    }

    // Leer criterio de búsqueda
    public String leerCriterioBusqueda() {

        scanner.nextLine();

        System.out.print("Ingrese nombre o apellido a buscar: ");

        return scanner.nextLine();
    }

    // Leer ID para eliminar
    public int leerIdEliminar() {

        System.out.print("Ingrese el ID del contacto a eliminar: ");

        return scanner.nextInt();
    }

    // Mostrar mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Cerrar scanner
    public void cerrarScanner() {
        scanner.close();
    }
}