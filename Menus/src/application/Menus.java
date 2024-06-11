package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Menus extends Application {
	@Override
    public void start(Stage primaryStage) {
        MenuBar menuBar = new MenuBar();
        Menu menuArchivo = new Menu("Archive");
        Menu menuNuevo = new Menu("New File");
        Menu menuSalir = new Menu("Exit");
        menuBar.getMenus().addAll(menuArchivo, menuNuevo, menuSalir);

        MenuItem ayuda = new MenuItem("Help");
        MenuItem nosotros = new MenuItem("About us");
        MenuItem guardarArchivo = new MenuItem("Save");
        menuArchivo.getItems().addAll(ayuda, nosotros, guardarArchivo, new SeparatorMenuItem());

        MenuItem copiarEditar = new MenuItem("Copy");
        MenuItem pegarEditar = new MenuItem("Page");
        MenuItem cortarEditar = new MenuItem("Cut");
        menuNuevo.getItems().addAll(cortarEditar, copiarEditar, pegarEditar);

        MenuItem acercaDeAyuda = new MenuItem("Properties");
        

        ayuda.setOnAction(e -> System.out.println("Nuevo archivo creado"));
        guardarArchivo.setOnAction(e -> System.out.println("Guardar archivo"));
        menuSalir.setOnAction(e -> primaryStage.close());
        cortarEditar.setOnAction(e -> System.out.println("Ha sido recortado correctamente"));
        copiarEditar.setOnAction(e -> System.out.println("Ha sido copiado correctamente"));
        pegarEditar.setOnAction(e -> System.out.println("Ha sido pegado correctamente"));
        
        acercaDeAyuda.setOnAction(e -> System.out.println("INFORMACION DEL PROGRAMA"));

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Menú en JavaFX");
        primaryStage.show();
    }


	
	public static void main(String[] args) {
		launch(args);
	}
}
