package Controlador;

import java.util.ArrayList;

import Modelo.Ingles;
import Modelo.Español;
import Modelo.Frances;

public class Controlador {
	private Ingles ingles;
	private Español español;
	private Fances frances;
	private ArrayList<Palabras> palabras = new ArrayList<>();
	
	public Controlador(){
		ingles = new Ingles();
		español = new Español();
		frances = new Frances();
		rellenarPalabras();
	}
	
	
	// METODOS
	

	private void rellenarPalabras() {
		for(int j = 0; j < getIdiomas().size(); j++){
		for(int i = 0; i < getIdiomas(j).size(); i++){
			Idiomas[i] = new (getIdiomas.get(i));
		}
	}
	}

}
