package modelo;

import java.util.ArrayList;

public class Ingles {

	private ArrayList ingles;
	private ArrayList dIngles;



public Ingles() {
	}

	private void palabrasIng() {
		ArrayList<String> ingles = new ArrayList();

		ingles.add("soccer");
		ingles.add("tennis");
		ingles.add("basketball");

	}


private void definicionEsp() {
	ArrayList<String> dIngles = new ArrayList();

	dIngles.add("A sport played between two teams of eleven players who try to drive a ball "
			+ "into the opponent's goal with their feet, head or any part of the body except "
			+ "the hands and arms");
	dIngles.add("A sport played between two players or two pairs on a rectangular court "
			+ "divided transversely by a net; it consists of propelling a ball with a racket "
			+ "over the net in an attempt to make it bounce in the opponent's court and prevent "
			+ "the opponent from returning it"
			);
	dIngles.add("A sport played on a rectangular court between two teams of five players "
			+ "who try to put the ball into the opponent's basket, which is at a height of 3.05 m,"
			+ " using only their hands; baskets are worth one, two or three points and the team "
			+ "that scores the most points in the 40 minutes of the game wins");


}

public ArrayList<String> getPalabrasIndice(int indice) {
	return (ArrayList<String>) (ingles.get(indice));
}

public ArrayList<String> getDefinicionIndice(int indice) {
	return (ArrayList<String>) (dIngles.get(indice));
}

public ArrayList getIngles() {
	return ingles;
}

public void setIngles(ArrayList ingles) {
	this.ingles = ingles;
}

public ArrayList getdIngles() {
	return dIngles;
}

public void setdIngles(ArrayList dIngles) {
	this.dIngles = dIngles;
}

	
}