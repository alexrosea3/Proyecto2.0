package modelo;

import java.util.ArrayList;

public class Frances {

private ArrayList frances;
private ArrayList dFrances;

public Frances() {
	
}

private void palabrasIng() {
	ArrayList<String> frances = new ArrayList();

	frances.add("football");
	frances.add("tennis");
	frances.add("basketball");

}


private void definicionEsp() {
ArrayList<String> dFrances = new ArrayList();

dFrances.add("Sport pratiqué entre deux équipes de onze joueurs qui tentent de mettre "
		+ "un ballon dans le but adverse en le propulsant avec les pieds, la tête ou "
		+ "toute autre partie du corps à l'exception des mains et des bras");

dFrances.add("Sport pratiqué entre deux joueurs ou deux paires sur un terrain "
		+ "rectangulaire divisé transversalement par un filet  il consiste à propulser "
		+ "une balle avec une raquette au-dessus du filet pour tenter de la faire rebondir"
		+ " dans le terrain de l'adversaire et l'empêcher de la renvoyer"
		);

dFrances.add("A sport played on a rectangular court between two teams of five players "
		+ "who try to put the ball into the opponent's basket, which is at a height of 3.05 m,"
		+ " using only their hands; baskets are worth one, two or three points and the team "
		+ "that scores the most points in the 40 minutes of the game wins");


}

public ArrayList<String> getPalabrasIndice(int indice) {
return (ArrayList<String>) (frances.get(indice));
}

public ArrayList<String> getDefinicionIndice(int indice) {
return (ArrayList<String>) (dFrances.get(indice));
}

public ArrayList getFrances() {
	return frances;
}

public void setFrances(ArrayList frances) {
	this.frances = frances;
}

public ArrayList getdFrances() {
	return dFrances;
}

public void setdFrances(ArrayList dFrances) {
	this.dFrances = dFrances;
}

}
