package vallegrande.edu.pe.model;

public class Autor {

    private int id;
    private String nombre;

    //Constructor
    public Autor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}