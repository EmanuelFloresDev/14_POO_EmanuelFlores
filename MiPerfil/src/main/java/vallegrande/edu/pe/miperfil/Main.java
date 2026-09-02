package vallegrande.edu.pe.miperfil;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vallegrande.edu.pe.miperfil.controller.PerfilController;
import vallegrande.edu.pe.miperfil.view.PerfilView;

public class Main extends Application {


    @Override
    public void start(Stage stage) {

        PerfilView view = new PerfilView();

        new PerfilController(view);

        Scene scene = new Scene(
                view.getContenedor(),
                420,
                500
        );

        scene.getStylesheets().add(
                getClass().getResource("/css/style.css").toExternalForm()
        );

        stage.setTitle("Mi Perfil");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
