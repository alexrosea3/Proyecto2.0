package Modelo;

import java.util.ArrayList;

public class Modelo {

	ArrayList <String> txtbtn = new ArrayList();
	ArrayList <String> idiomas = new ArrayList();
	public Modelo() {
		txtbtn.add("Dar de Alta");
		txtbtn.add("Buscar");
		txtbtn.add("Borrar");
	}
	public ArrayList<String> getTxtbtn() {
		return txtbtn;
	}
	public void setTxtbtn(ArrayList<String> txtbtn) {
		this.txtbtn = txtbtn;
	}
	public ArrayList<String> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(ArrayList<String> idiomas) {
		this.idiomas = idiomas;
	}
	
}
