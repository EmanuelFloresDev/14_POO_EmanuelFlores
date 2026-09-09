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
        System.out.println("==============================");
        System.out.println("      AGENDA DE CONTACTOS");
        System.out.println("==============================");
    }

    // Mostrar menú
    public void mostrarMenu() {
        System.out.println("\n===== MENÚ =====");
        System.out.println("1. Registrar contacto");
        System.out.println("2. Mostrar contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Salir");
        System.out.println("================");
    }

    // Leer opción
    public int leerOpcion() {
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    // Ingresar contacto
    public Contacto ingresarContacto() {

        scanner.nextLine();

        System.out.print("Nombre: ");
        String nombres = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellidos = scanner.nextLine();

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        return new Contacto(nombres, apellidos, telefono);
    }

    // Mostrar contactos
    public void mostrarContactos(ArrayList<Contacto> contactos) {

        if (contactos.isEmpty()) {
            System.out.println("\nNo hay contactos registrados.");
            return;
        }

        System.out.println("\n===== CONTACTOS =====");

        for (Contacto contacto : contactos) {
            contacto.mostrarContacto();
        }
    }

    // Leer criterio de búsqueda
    public String leerCriterioBusqueda() {

        scanner.nextLine();

        System.out.print("Ingrese nombre o apellido: ");

        return scanner.nextLine();
    }

    // Mostrar mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Cerrar Scanner
    public void cerrarScanner() {
        scanner.close();
    }
}