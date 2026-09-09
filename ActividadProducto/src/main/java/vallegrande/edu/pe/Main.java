package vallegrande.edu.pe;

public class Main {

    public static void main(String[] args) {

        // Crear un objeto Producto
        Producto producto = new Producto(
                "Laptop Lenovo",
                "P001",
                2500.00,
                10,
                "Tecnología"
        );

        // Mostrar información del producto
        producto.mostrarInformacion();

        // Actualizar el stock
        producto.actualizarStock(15);

        System.out.println("\nDespués de actualizar el stock:");
        producto.mostrarInformacion();
    }
}