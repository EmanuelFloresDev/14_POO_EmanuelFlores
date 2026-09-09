package vallegrande.edu.pe.sistema_menu.controller;

import vallegrande.edu.pe.sistema_menu.view.menuView;

public class menuController {

    private menuView view;

    public menuController(menuView view) {
        this.view = view;
        configurarEventos();
    }

    private void configurarEventos() {
        view.getBtnInicio().setOnAction(e -> {
            view.mostrarInicio();
        });

        view.getBtnUsuarios().setOnAction(e -> {
            view.mostrarUsuarios();
        });

        view.getBtnProductos().setOnAction(e -> {
            view.mostrarProductos();
        });

        // Eventos para las 3 nuevas opciones
        view.getBtnReportes().setOnAction(e -> {
            view.mostrarReportes();
        });

        view.getBtnConfiguracion().setOnAction(e -> {
            view.mostrarConfiguracion();
        });

        view.getBtnCitas().setOnAction(e -> {
            view.mostrarCitas();
        });
    }
}