package vallegrande.edu.pe.app;
import vallegrande.edu.pe.controller.AgendaController;
import vallegrande.edu.pe.model.Contacto;
import vallegrande.edu.pe.view.AgendaView;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear objetos
        AgendaController controller = new AgendaController();
        AgendaView view = new AgendaView();
        // Mostrar título
        view.mostrarTitulo();
        // Crear contactos
        Contacto contacto1 = new Contacto(
                "Ana",
                "Torres",
                "987345656"
        );
        Contacto contacto2 = new Contacto(
                "Carlos",
                "Perez",
                "951264456"
        );

        // Registrar contactos
        controller.agregarContacto(contacto1);
        controller.agregarContacto(contacto2);

        boolean continuar = true;
        while (continuar) {
            view.mostrarMenu();
            int opcion = view.leerOpcion();
            switch (opcion) {
                case 1:
                    // Registrar contacto
                    Contacto nuevoContacto = view.ingresarContacto();
                    controller.agregarContacto(nuevoContacto);
                    view.mostrarMensaje(
                            "Contacto registrado correctamente."
                    );
                    break;

                case 2:
                    // Mostrar contactos
                    view.mostrarContactos(
                            controller.listarContactos()
                    );
                    break;

                case 3:
                    // Buscar contacto
                    String criterio = view.leerCriterioBusqueda();

                    ArrayList<Contacto> resultados =
                            controller.buscarContacto(criterio);

                    if (resultados.isEmpty()) {
                        view.mostrarMensaje(
                                "No se encontró el contacto."
                        );

                    } else {
                        view.mostrarMensaje(
                                "\nContacto encontrado:"
                        );
                        view.mostrarContactos(resultados);
                    }
                    break;

                case 4:
                    // Salir
                    view.mostrarMensaje(
                            "Saliendo de la Agenda de Contactos..."
                    );
                    continuar = false;
                    break;

                default:
                    view.mostrarMensaje(
                            "Opción no válida."
                    );
            }
        }
        view.cerrarScanner();
    }
}