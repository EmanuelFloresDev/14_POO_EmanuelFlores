module vallegrande.edu.pe.taller {
    requires javafx.controls;
    requires javafx.fxml;

    opens vallegrande.edu.pe.taller to javafx.fxml;
    opens vallegrande.edu.pe.taller.controller to javafx.fxml;
    opens vallegrande.edu.pe.taller.model to javafx.base;

    exports vallegrande.edu.pe.taller;
}