package dad.buscarYReemplazar.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class View extends GridPane{
	TextField buscarTf,reemplazarTf;
	CheckBox firstCh,secCh,thirdCh,fourthCh;
	Button buscarBoton,reemplazarBoton,reemplazarTodoBoton,cerrarBoton,ayudaBoton;
	VBox derecha;
	GridPane izquierda, checkBoxDiv;
	
	public View() {
	

		
	//Right
		buscarBoton=new Button("Buscar");
		buscarBoton.setMinWidth(120);
		
		reemplazarBoton=new Button("Reemplazar");
		reemplazarBoton.setMinWidth(120);
		
		reemplazarTodoBoton=new Button("Reemplazar Todo");
		reemplazarTodoBoton.setMinWidth(120);
		
		cerrarBoton=new Button("Cerrar");
		cerrarBoton.setMinWidth(120);
		
		ayudaBoton=new Button("Ayuda");
		ayudaBoton.setMinWidth(120);

		derecha=new VBox();
		derecha.setSpacing(5);
		derecha.setAlignment(Pos.TOP_RIGHT);
		derecha.getChildren().addAll(buscarBoton,reemplazarBoton,reemplazarTodoBoton,cerrarBoton,ayudaBoton);
		
		
	//Left
		buscarTf=new TextField();
		buscarTf.setPromptText("Buscar...");
		
		reemplazarTf=new TextField();
		reemplazarTf.setPromptText("Reemplazar...");

		firstCh=new CheckBox();
		secCh=new CheckBox();
		thirdCh=new CheckBox();
		fourthCh=new CheckBox();

		checkBoxDiv=new GridPane();
		checkBoxDiv.setHgap(5);
		checkBoxDiv.setVgap(5);
		checkBoxDiv.addRow(0,firstCh, new Label("Mayúsculas y minúsculas"), secCh, new Label("Buscar Hacia Atrás"));
		checkBoxDiv.addRow(1, thirdCh, new Label("Expresión regular") ,fourthCh, new Label("Resaltar Resultados"));
		
		this.setPadding(new Insets(5));
		this.setHgap(5);
		this.setVgap(5);
		this.setAlignment(Pos.TOP_LEFT);
		this.addRow(0, new Label("Buscar:"),buscarTf,derecha);
		this.addRow(1, new Label("Reemplazar con:"),reemplazarTf);
		this.addRow(2, new Label(""), checkBoxDiv);
		
		GridPane.setRowSpan(derecha, 3);
		
		this.addColumn(2);
//		this.setGridLinesVisible(true);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),	
				new ColumnConstraints(),
				new ColumnConstraints()
			};
		
		this.getColumnConstraints().setAll(cols);
		
		cols[0].setHalignment(HPos.RIGHT);
		
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);}

}
