package vallegrande.edu.pe.taller.model;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precioUnitario;
    private int stock;
    private double precioTotal;

    public Producto(String nombre, String descripcion, double precioUnitario, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.precioTotal = precioUnitario * stock;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public double getPrecioUnitario() { return precioUnitario; }
    public int getStock() { return stock; }
    public double getPrecioTotal() { return precioTotal; }
}