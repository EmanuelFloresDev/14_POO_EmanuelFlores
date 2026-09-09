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

    // Mostrar contactos
    public ArrayList<Contacto> listarContactos() {
        return contactos;
    }

    // Buscar contacto
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
}