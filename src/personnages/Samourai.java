package personnages;

public class Samourai extends Ronin {
	private String seigneur;
	
	
	public Samourai(String seigneur,String nom, String boisson, int argent) {
		super(nom, boisson, argent,0);
		this.seigneur = seigneur;
	}
	
	public String getSeigneur() {
		return seigneur;
	}
	
	public void boire(String boisson) {
		String texte = "Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".";
		parler(texte);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		String texte="Mon clan est celui de " + this.getSeigneur();
		parler(texte);
	}
}


