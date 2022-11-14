package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "Thé", argent,0);
	}

	public void seFaireExtorquer() {
		perdreArgent(getArgent());
		String texte = "J’ai tout perdu! Le monde est trop injuste";
		parler(texte);
	}
	
	public void recevoirArgent(int argent) {
		String texte = argent + " sous ! Je te remercie généreux donateur!";
		gagnerArgent(argent);
		parler(texte);
	}
}
