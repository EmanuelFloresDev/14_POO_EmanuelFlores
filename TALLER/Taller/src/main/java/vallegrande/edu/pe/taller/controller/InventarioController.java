package vallegrande.edu.pe.taller.controller;

import vallegrande.edu.pe.taller.model.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventarioController {

    @FXML private TableView<Producto> tablaProductos;
    @FXML private TableColumn<Producto, String> colNombre;
    @FXML private TableColumn<Producto, String> colDescripcion;
    @FXML private TableColumn<Producto, Double> colPrecioU;
    @FXML private TableColumn<Producto, Integer> colStock;
    @FXML private TableColumn<Producto, Double> colPrecioT;

    @FXML
    public void initialize() {
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        colPrecioU.setCellValueFactory(new PropertyValueFactory<>("precioUnitario"));
        colStock.setCellValueFactory(new PropertyValueFactory<>("stock"));
        colPrecioT.setCellValueFactory(new PropertyValueFactory<>("precioTotal"));

        ObservableList<Producto> lista = FXCollections.observableArrayList(
                new Producto("Small Cardboard Box", "Standard shipping container", 1.20, 500),
                new Producto("Large Box", "Heavy-duty large box", 2.50, 250),
                new Producto("Adhesive Tape", "Clear sealing tape", 0.80, 120),
                new Producto("Standard Label Rolls", "1000 labels", 12.00, 85),
                new Producto("Packing Peanuts", "Biodegradable loose fill", 5.50, 150),
                new Producto("Box Cutter", "Retractable knife", 3.00, 45)
        );

        tablaProductos.setItems(lista);
    }
}