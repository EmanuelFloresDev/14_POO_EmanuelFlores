package vallegrande.edu.pe.miperfil.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class PerfilView {


    private VBox contenedor;
    private Label titulo;
    private TextField txtNombre;
    private ComboBox<String> cbCarrera;
    private ComboBox<String> cbSemestre;
    private Button btnMostrar;
    private Button btnLimpiar;
    private Label lblResultado;

    public PerfilView() {

        titulo = new Label("MI PERFIL");
        titulo.getStyleClass().add("titulo");

        txtNombre = new TextField();
        txtNombre.setPromptText("Ingrese su nombre");

        cbCarrera = new ComboBox<>();
        cbCarrera.getItems().addAll(
                "Analista de Sistemas Empresariales",
                "Administración de Empresas",
                "Contabilidad",
                "Marketing"
        );
        cbCarrera.setPromptText("Seleccione su carrera");
        cbCarrera.setMaxWidth(Double.MAX_VALUE);

        cbSemestre = new ComboBox<>();
        cbSemestre.getItems().addAll(
                "I Semestre",
                "II Semestre",
                "III Semestre",
                "IV Semestre",
                "V Semestre",
                "VI Semestre"
        );
        cbSemestre.setPromptText("Seleccione su semestre");
        cbSemestre.setMaxWidth(Double.MAX_VALUE);

        btnMostrar = new Button("Mostrar Perfil");
        btnMostrar.getStyleClass().add("btn-mostrar");

        btnLimpiar = new Button("Limpiar");
        btnLimpiar.getStyleClass().add("btn-limpiar");

        lblResultado = new Label();
        lblResultado.getStyleClass().add("resultado");
        lblResultado.setWrapText(true);

        contenedor = new VBox(12);
        contenedor.setPadding(new Insets(25));
        contenedor.setAlignment(Pos.CENTER);
        contenedor.getStyleClass().add("contenedor");

        contenedor.getChildren().addAll(
                titulo,
                txtNombre,
                cbCarrera,
                cbSemestre,
                btnMostrar,
                btnLimpiar,
                lblResultado
        );
    }

    public VBox getContenedor() {
        return contenedor;
    }

    public TextField getTxtNombre() {
        return txtNombre;
    }

    public ComboBox<String> getCbCarrera() {
        return cbCarrera;
    }

    public ComboBox<String> getCbSemestre() {
        return cbSemestre;
    }

    public Button getBtnMostrar() {
        return btnMostrar;
    }

    public Button getBtnLimpiar() {
        return btnLimpiar;
    }

    public Label getLblResultado() {
        return lblResultado;
    }

}
