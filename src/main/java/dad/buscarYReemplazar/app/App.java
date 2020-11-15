package dad.buscarYReemplazar.app;

import dad.buscarYReemplazar.controller.Controlador;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class App extends Application{
	Controlador control= new Controlador();
	
	public void start (Stage primaryStage) throws Exception{
		Scene escena = new Scene(control.getView(),550,200);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}

}
