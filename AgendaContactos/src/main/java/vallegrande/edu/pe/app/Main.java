package vallegrande.edu.pe.app;

import vallegrande.edu.pe.controller.AgendaController;
import vallegrande.edu.pe.model.Contacto;
import vallegrande.edu.pe.view.AgendaView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Crear componentes MVC
        AgendaController controller = new AgendaController();
        AgendaView view = new AgendaView();

        // Mostrar título
        view.mostrarTitulo();

        // CONTACTOS PRECARGADOS

        Contacto contacto1 = new Contacto(
                1,
                "Ana",
                "Torres",
                "Cañete",
                "987345656",
                "ana@gmail.com"
        );

        Contacto contacto2 = new Contacto(
                2,
                "Carlos",
                "Perez",
                "Imperial",
                "951264456",
                "carlos@gmail.com"
        );

        Contacto contacto3 = new Contacto(
                3,
                "Maria",
                "Gomez",
                "San Vicente",
                "987654321",
                "maria@gmail.com"
        );

        Contacto contacto4 = new Contacto(
                4,
                "Luis",
                "Flores",
                "Nuevo Imperial",
                "999888777",
                "luis@gmail.com"
        );

        Contacto contacto5 = new Contacto(
                5,
                "Pedro",
                "Ramirez",
                "Mala",
                "955444333",
                "pedro@gmail.com"
        );

        // Agregar contactos
        controller.agregarContacto(contacto1);
        controller.agregarContacto(contacto2);
        controller.agregarContacto(contacto3);
        controller.agregarContacto(contacto4);
        controller.agregarContacto(contacto5);

        // MENÚ PRINCIPAL

        boolean continuar = true;
        int siguienteId = 6;

        while (continuar) {
            view.mostrarMenu();
            int opcion = view.leerOpcion();
            switch (opcion) {
                case 1:

                    // Registrar
                    Contacto nuevoContacto = view.ingresarContacto(siguienteId);

                    controller.agregarContacto(nuevoContacto);

                    view.mostrarMensaje(
                            "Contacto registrado correctamente."
                    );

                    siguienteId++;

                    break;

                case 2:

                    // Listar
                    view.mostrarContactos(
                            controller.listarContactos()
                    );
                    break;

                case 3:

                    // Buscar
                    String criterio = view.leerCriterioBusqueda();

                    ArrayList<Contacto> resultados =
                            controller.buscarContacto(criterio);

                    if (resultados.isEmpty()) {

                        view.mostrarMensaje(
                                "No se encontraron contactos."
                        );

                    } else {

                        view.mostrarMensaje(
                                "\nContactos encontrados:"
                        );

                        view.mostrarContactos(resultados);
                    }

                    break;

                case 4:

                    // Eliminar
                    int id = view.leerIdEliminar();

                    boolean eliminado =
                            controller.eliminarContacto(id);

                    if (eliminado) {

                        view.mostrarMensaje(
                                "Contacto eliminado correctamente."
                        );

                    } else {

                        view.mostrarMensaje(
                                "No existe un contacto con ese ID."
                        );
                    }

                    break;

                case 5:

                    // Salir
                    view.mostrarMensaje(
                            "Saliendo de la Agenda de Contactos..."
                    );

                    continuar = false;

                    break;

                default:

                    view.mostrarMensaje(
                            "Opción no válida. Seleccione del 1 al 5."
                    );
            }
        }

        view.cerrarScanner();
    }
}