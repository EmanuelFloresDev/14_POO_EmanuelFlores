package vallegrande.edu.pe.miperfil.controller;

import javafx.scene.control.Alert;
import vallegrande.edu.pe.miperfil.model.Perfil;
import vallegrande.edu.pe.miperfil.view.PerfilView;

public class PerfilController {

    private PerfilView view;

    public PerfilController(PerfilView view) {

        this.view = view;

        view.getBtnMostrar().setOnAction(e -> mostrarPerfil());

        view.getBtnLimpiar().setOnAction(e -> limpiarCampos());
    }

    private void mostrarPerfil() {

        String nombre = view.getTxtNombre().getText().trim();

        // Nivel 2: Validación del nombre
        if (nombre.isEmpty()) {

            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Validación");
            alerta.setHeaderText(null);
            alerta.setContentText("Por favor, ingrese su nombre.");

            alerta.showAndWait();
            return;
        }

        String carrera = view.getCbCarrera().getValue();
        String semestre = view.getCbSemestre().getValue();

        if (carrera == null) {
            carrera = "No seleccionada";
        }

        if (semestre == null) {
            semestre = "No seleccionado";
        }

        Perfil perfil = new Perfil(
                nombre,
                carrera,
                semestre
        );

        view.getLblResultado().setText(
                perfil.obtenerPresentacion()
        );
    }

    // Nivel 1: Limpiar campos
    private void limpiarCampos() {

        view.getTxtNombre().clear();
        view.getCbCarrera().setValue(null);
        view.getCbSemestre().setValue(null);
        view.getLblResultado().setText("");
    }


}
