package com.adam.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        // Creo el panel
        BorderPane root = new BorderPane();
        // Creo el boton
        Button bt1 = new Button("Encabezado");
        // Se posiciona arriba, abajo, izquierda, derecha o centro
        root.setTop(bt1);
        // Se define el ancho y alto
        bt1.setMaxWidth(Double.MAX_VALUE);
        bt1.setMaxHeight(Double.MAX_VALUE);
        // Se define el margen del boton
        BorderPane.setMargin(bt1, new Insets(5, 5, 5, 5));

        Button bt2 = new Button("Navegación");
        root.setRight(bt2);
        bt2.setMaxHeight(Double.MAX_VALUE);
        BorderPane.setMargin(bt2, new Insets(5, 5, 5, 5));

        Button bt3 = new Button("Cuerpo");
        root.setCenter(bt3);
        bt3.setMaxWidth(Double.MAX_VALUE);
        bt3.setMaxHeight(Double.MAX_VALUE);
        BorderPane.setMargin(bt3, new Insets(5, 5, 5, 5));


        Button bt4 = new Button("Articulo");
        root.setLeft(bt4);
        bt4.setMaxHeight(Double.MAX_VALUE);
        BorderPane.setMargin(bt4, new Insets(5, 5, 5, 5));

        Button bt5 = new Button("Pie");
        root.setBottom(bt5);
        bt5.setMaxWidth(Double.MAX_VALUE);
        bt5.setMaxHeight(Double.MAX_VALUE);
        BorderPane.setMargin(bt5, new Insets(5, 5, 5, 5));


        // AÑADE AQUÍ LOS OTROS CUATRO BOTONES: CENTER, BOTTOM, RIGHT y LEFT
        scene = new Scene(root, 300,250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
