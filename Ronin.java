package tp1.personnages.principaux;

import tp1.Humain;

public class Ronin extends Humain {
	
	private int honneur;
	
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent,boisson);
		this.honneur = 1;
	}
	
	public void donner(int n, Commercant c) {
		this.perdreArgent(n);
		c.recevoir(n);
	}
	
	public void provoquer(Yakusa y) {
		if ((2*this.honneur)> (y.getReputation())) {
			this.gagnerArgent(y.getArgent());
			y.perdre();
			this.honneur+=1;
			this.parler("J'ai gagné eheh");
		}
		else {
			y.gagner();
			this.honneur--;
			this.parler("Je râle car j'ai perdu :(");
		}
	}
}
