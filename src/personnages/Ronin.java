package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent, int honneur) {
		super(nom, boisson, argent,0);
		this.honneur = honneur;
	}
	
	public int getHonneur() {
		return honneur;
	}

	public void donner(Commercant beneficiaire){
		int argentdonnee = getArgent()/10;
		perdreArgent(getArgent()/10);
		String texte = beneficiaire.getNom() + " prends ces " + argentdonnee + " sous.";
		parler(texte);
		texte = argentdonnee + " sous ! Je te remercie généreux donateur!";
		beneficiaire.parler(texte);
	}
	
	public void provoquer(Yakuza yakuza) {
		String texte = "Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!";
		parler(texte);
		if (yakuza.getReputation() <= 2*getHonneur()) {
			texte = "Je t’ai eu petit yakusa!";
			parler(texte);
			texte = "J’ai perdu mon duel et mes "+yakuza.getArgent()+ " sous, snif... J'ai déshonoré le clan de " + yakuza.getClan();
			yakuza.parler(texte);
			gagnerArgent(yakuza.getArgent());
			yakuza.perdreArgent(yakuza.getArgent());
			honneur+=2;
		}
		else {
			texte = "J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup";
			parler(texte);
			texte = "Ce ronin pensait vraiment battre " + yakuza.getNom() + " clan de " +yakuza.getClan() + " ? Je l'ai dépouillé de ses "
			+ getArgent() + " sous.";
			yakuza.parler(texte);
			yakuza.gagnerArgent(getArgent());
			perdreArgent(getArgent());
			honneur-=2;
		}
	}
}
