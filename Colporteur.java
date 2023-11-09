package tp1.personnages.secondaires;

import tp1.personnages.principaux.Commercant;

public class Colporteur extends Commercant{

	public Colporteur(String nom, int argent) {
		super(nom, argent);
	}
	
	public int seFaireExtorquer() {
		this.perdreArgent((this.getArgent()/2));
		this.parler("Le monde est vraiment trop injuste ! Il ne me reste que " + this.getArgent());
		return this.getArgent();
	}
}
