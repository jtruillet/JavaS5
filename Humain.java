package tp1;

public class Humain {
	
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain (String nom, int argent, String boisson){
		this.nom=nom;
		this.argent=argent;
		this.boisson=boisson;
	}
	
	public void parler(String texte) {
		System.out.println("(" + this.nom + ")" + " - " + texte);
		System.out.println();
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! \n" + "Je m'appelle " + this.nom + "et j'aime boire de la " + this.boisson + "\n" + "Et j'ai " +
				this.argent + " sous en poche");
	}
	
	public void boire() {
		this.parler("Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	public String getBoisson() {
		return this.boisson;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void gagnerArgent (int n) {
		this.argent+=n;
	}
	
	public void perdreArgent (int n) {
		this.argent-=n;
	}
	
}
