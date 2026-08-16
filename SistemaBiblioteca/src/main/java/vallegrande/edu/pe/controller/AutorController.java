package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Autor;
import java.util.ArrayList;

public class AutorController {
    private ArrayList<Autor> autores;

    public AutorController() {
        autores = new ArrayList<>();
    }

    public void registrarAutor(Autor autor) {
        autores.add(autor);
    }

    public void listarAutores() {
        for (Autor autor : autores) {
            System.out.println("ID: " + autor.getId());
            System.out.println("Nombre: " + autor.getNombre());
            System.out.println("--------------------");
        }
    }
}