package tp1.personnages.secondaires; 

import tp1.personnages.principaux.Yakusa;

public class Ninja extends Yakusa{

	private String clanSecret;
	private String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	
	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
	}
	
	public void direBonjour() {
		super.direBonjour();
		
		this.parler(" Mon clan secret est " + this.getClan() + " " + this.clanSecret + " et maintenant que "
				+ "tu le sais, je vais devoir te tuer");
	}
}
