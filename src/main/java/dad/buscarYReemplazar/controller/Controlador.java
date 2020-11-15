package dad.buscarYReemplazar.controller;

import dad.buscarYReemplazar.model.Modelo;
import dad.buscarYReemplazar.view.View;

public class Controlador {
	private View vista=new View();
	private Modelo model= new Modelo();
	
	public Controlador() {
		
	}
	public View getView() {
		return this.vista;
	}
}
