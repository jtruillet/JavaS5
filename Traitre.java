package tp1.personnages.secondaires;

import tp1.Humain;
import tp1.personnages.principaux.*;

public class Traitre extends Samourai{
	
	private int traitrise;
	
	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
		this.traitrise=0;
	}
	
	public void extorquer(Commercant c) {
		if (this.traitrise <= 2) {
			this.gagnerArgent(c.getArgent());
			c.seFaireExtorquer();
			this.traitrise+=1;
			this.parler("J'ai extorqué un commerçant ! MOUAHAHAH" +
			"\n" + "Mon niveau de traitrise est égal à " + this.traitrise);
		}
		
		else {
			this.parler("Je ne peux plus extorquer :( car mon niveau de traitrise est égal à " 
					+ this.traitrise);
		}	
	}
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon niveau de traitrise est de : " + this.traitrise);
	}
	
	public void faireLeGentil(Humain h, int argent) {
		h.gagnerArgent(argent);
		this.perdreArgent(argent);
		this.traitrise-=(argent/10);
		if (this.traitrise < 0) {
			this.traitrise=0;
		}
	}
}
