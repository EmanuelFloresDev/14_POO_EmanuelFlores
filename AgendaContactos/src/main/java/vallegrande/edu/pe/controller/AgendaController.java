package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Contacto;

import java.util.ArrayList;

public class AgendaController {

    // Lista de contactos
    private ArrayList<Contacto> contactos;

    // Constructor
    public AgendaController() {
        contactos = new ArrayList<>();
    }

    // Registrar contacto
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    // Listar contactos
    public ArrayList<Contacto> listarContactos() {
        return contactos;
    }

    // Buscar por nombre o apellido
    public ArrayList<Contacto> buscarContacto(String criterio) {

        ArrayList<Contacto> resultados = new ArrayList<>();

        for (Contacto contacto : contactos) {

            String nombreCompleto =
                    contacto.getNombres() + " " + contacto.getApellidos();

            if (nombreCompleto.toLowerCase().contains(criterio.toLowerCase())) {
                resultados.add(contacto);
            }
        }

        return resultados;
    }

    // Eliminar por ID
    public boolean eliminarContacto(int id) {

        for (Contacto contacto : contactos) {

            if (contacto.getId() == id) {
                contactos.remove(contacto);
                return true;
            }
        }

        return false;
    }
}