package personnages;

public class Humain {
	private String nom;
	private String boissonprefere;
	private int argent;
	private int nbConnaissance = 0;
	private Humain[] memoire;
	
	public Humain(String nom, String boisson, int argent, int nbConnaissance) {
		this.nom = nom;
		this.boissonprefere = boisson;
		this.argent = argent;
		this.nbConnaissance = nbConnaissance;
		this.memoire = new Humain[30];
	}

	public String getNom() {
		return this.nom;
	}
	
	public int getNbConnaissance() {
		return nbConnaissance;
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	public void parler(String texte) {
		System.out.println( "(" + nom + ")" +"- "+texte);
	}
	
	public void direBonjour() {
		String texte = "Bonjour je m'appelle " + this.nom + " et j'aime boire du " + this.boissonprefere;
		parler(texte);
	}
	
	public void memoriser(Humain humain) {
		if (nbConnaissance+1 > 30) {
			for (int i = 0; i < nbConnaissance-1; i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[29]=humain;
		} else {
			memoire[nbConnaissance]=humain;
			nbConnaissance++;
		}
	}
	
	public void listeConnaissance() {
		String texte = "Je connais beaucoup de monde dont : ";
		for (int i = 0; i <= nbConnaissance-2; i++) {
			texte = texte + memoire[i].getNom() + ", ";
		}
		texte = texte + memoire[nbConnaissance-1].getNom();
		parler(texte);
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		String texte = "Le " + this.getClass().getSimpleName() + " " + this.getNom() + " rencontre le " + humain.getClass().getSimpleName() + "." ;
		System.out.println(texte);
		direBonjour();
		humain.direBonjour();
		memoriser(humain);
		humain.memoriser(this);
		
	}
	
	public void boire() {
		String texte = "Mmmm, un bon verre de " + boissonprefere + " ! GLOUPS !";
		parler(texte);
	}
	
	public void acheter(String bien, int prix) {
		String texte = "";
		if (argent >= prix) {
			texte += "J'ai " + this.argent + " sous en poche. Je vais pouvir m'offrir une boisson à " + prix + " sous";
			perdreArgent(prix);
		}
		else {
			texte += "Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même pas m'offrir un "
			+ bien + " à " + prix + " sous";
		}
		parler(texte);
	}
	
	public void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	public void perdreArgent(int gain) {
		this.argent -= gain;
	}
}
