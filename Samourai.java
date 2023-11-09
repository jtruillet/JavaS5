package tp1.personnages.secondaires;

import tp1.personnages.principaux.Ronin;

public class Samourai extends Ronin{

	private String seigneur;
	
	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur=seigneur;
	}
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon seigneur est " + this.seigneur);
	}
	
	public void boire(String boisson) {
		super.boire();
	}
}
