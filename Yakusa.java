package tp1.personnages.principaux;

import tp1.Humain;

public class Yakusa extends Humain {
	
	private String clan;
	private int reputation;
	
	public Yakusa(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan=clan;
		this.reputation=0;
	}
	
	public String getClan() {
		return this.clan;
	}
	
	public int getReputation() {
		return this.reputation;
	}
	
	public void extorquer(Commercant c) {
		this.gagnerArgent(c.getArgent());
		c.seFaireExtorquer();
		this.reputation+=1;
		this.parler("J'ai extorqué un commerçant ! MOUAHAHAH");
	}
	
	public int perdre() {
		this.perdreArgent(this.getArgent());
		this.reputation-=1;
		this.parler("J'ai perdu :( ");
		return this.getArgent();
	}
	
	public void gagner() {
		this.reputation+=1;
		this.parler("J'ai gagné !!!!");
	}
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis dans le clan " + this.clan);
	}
	
	
}
