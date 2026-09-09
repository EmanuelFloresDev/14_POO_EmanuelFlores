package vallegrande.edu.pe.sistema_menu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vallegrande.edu.pe.sistema_menu.controller.menuController;
import vallegrande.edu.pe.sistema_menu.view.menuView;

public class main extends Application {

    @Override
    public void start(Stage stage) {
        menuView view = new menuView();
        new menuController(view);

        Scene scene = new Scene(view, 900, 600);
        stage.setTitle("MI SISTEMA");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}