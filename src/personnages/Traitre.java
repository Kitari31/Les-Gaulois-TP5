package personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int traitrise = 0;
	
	public Traitre(String seigneur,String nom, String boisson, int argent) {
		super(seigneur,nom, boisson, argent);
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		String texte = "Mais je suis un traître et mon niveau de traîtrise est : " + getTraitrise() + ". Chut !";
		parler(texte);
	}

	public int getTraitrise() {
		return traitrise;
	}
	
	public void ranconner(Commercant commercant) {
		if (traitrise < 3) {
			int argent = commercant.getArgent();
			argent = argent / 5;
			commercant.perdreArgent(argent);
			gagnerArgent(argent);
			String texte = "Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + argent + " sous ou gare à toi !";
			parler(texte);
			texte = "Tout de suite grand " + getNom() + ".";
			commercant.parler(texte);
		} else {
			String texte = "Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !";
			parler(texte);
		}
	}
	
	public void faireLeGentil() {
		if (getNbConnaissance() < 1 ) {
			String texte = "Je ne peux faire ami ami avec personne car je ne connais personne ! Snif";
			parler(texte);
		} else {
			int don = getArgent()/20;
			
		}
	}
}