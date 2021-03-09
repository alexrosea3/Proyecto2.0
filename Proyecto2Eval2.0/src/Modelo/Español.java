package modelo;

import java.util.ArrayList;

public class Español {

	private ArrayList español;
	private ArrayList dEspañol;

	public Español() {

	}

	private void palabrasEsp() {
		ArrayList<String> español = new ArrayList();

		español.add("futbol");
		español.add("tenis");
		español.add("baloncesto");

	}

	private void definicionEsp() {
		ArrayList<String> dEspañol = new ArrayList();

		dEspañol.add("Deporte que se practica entre dos equipos de once jugadores que tratan "
				+ "de introducir un balón en la portería del contrario impulsándolo con los pies, "
				+ "la cabeza o cualquier parte del cuerpo excepto las manos y los brazos.");
		dEspañol.add("Deporte que se practica entre dos jugadores o dos parejas en una pista"
				+ " rectangular dividida transversalmente por una red; consiste en impulsar "
				+ "una pelota con una raqueta por encima de la red intentando que bote en "
				+ "el campo contrario y que el adversario no la pueda devolver");
		dEspañol.add("Deporte que se practica, en una cancha rectangular, entre dos equipos "
				+ "de cinco jugadores que tratan de introducir el balón en la canasta contraria, "
				+ "que se encuentra a una altura de 3,05 m, valiéndose solo de las manos; "
				+ "los encestes valen uno, dos o tres puntos y gana el equipo que logra más puntos "
				+ "en los 40 minutos que dura el encuentro");

	}

	public ArrayList<String> getPalabrasIndice(int indice) {
		return (ArrayList<String>) (español.get(indice));
	}

	public ArrayList<String> getDefinicionIndice(int indice) {
		return (ArrayList<String>) (dEspañol.get(indice));
	}

	public ArrayList getEspañol() {
		return español;
	}

	public void setEspañol(ArrayList español) {
		this.español = español;
	}

	public ArrayList getdEspañol() {
		return dEspañol;
	}

	public void setdEspañol(ArrayList dEspañol) {
		this.dEspañol = dEspañol;
	}

}
