package tp1.personnages.secondaires;

import java.util.ArrayList;

import tp1.Humain;

public class GrandMere extends Humain{

	private int nbConnaissances=0;
	ArrayList<Humain> memoire = new ArrayList<Humain>(30);
	
	public GrandMere(String nom) {
		super(nom, 0, "tisane");
		this.nbConnaissances=0;
	}
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je connais " + this.nbConnaissances);
	}
	
	public void faireConnaissanceAvec(Humain h) {
		memoire.add(h);
		this.nbConnaissances+=1;
		this.parler("J'ai fais connaissance avec " + h.getNom());
	}
	
	public void ragoter() {
		for(int i=0;i<memoire.size();i++) {
			if (memoire.get(i) instanceof Traitre) {
				this.parler(memoire.get(i).getNom() + " est un traitre");
			}
			else {
				this.parler("Je crois que " + memoire.get(i).getNom() + " est un Ronin");
			}
			
		}
	}
	
}
