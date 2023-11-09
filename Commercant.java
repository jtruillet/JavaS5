package tp1.personnages.principaux;

import tp1.Humain;

public class Commercant extends Humain {
	
	public Commercant (String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		this.perdreArgent(this.getArgent());
		this.parler("Le monde est vraiment trop injuste !");
		return this.getArgent();
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler("Merci ronin tu es trop sympa !");
	}
		
}
