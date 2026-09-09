package vallegrande.edu.pe.model;

public class Contacto {

    // Atributos
    private String nombres;
    private String apellidos;
    private String telefono;

    // Constructor
    public Contacto(String nombres, String apellidos, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    // Getters
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    // Mostrar contacto
    public void mostrarContacto() {
        System.out.println("Nombre: " + nombres + " " + apellidos);
        System.out.println("Teléfono: " + telefono);
        System.out.println("-------------------------");
    }
}