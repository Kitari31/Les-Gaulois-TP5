package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent,String clan, int reputation) {
		super(nom, boisson, argent,0);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public String getClan() {
		return clan;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		String texte="Mon clan est celui de " + this.getClan();
		parler(texte);
	}

	public void Extorquer(Commercant victime) {
		String texte = "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?";
		parler(texte);
		texte = victime.getNom() +", si tu tiens à la vie donne moi ta bourse !";
		parler(texte);
		int argentvictime = victime.getArgent();
		int argentgagnee = getArgent() + argentvictime;
		gagnerArgent(argentvictime);
		victime.seFaireExtorquer();
		texte = "J’ai piqué les " + argentvictime + " sous de " + victime.getNom() +", ce qui me fait "
				+ argentgagnee + " sous dans ma poche. Hi ! Hi !";
		
		parler(texte);
	}
}
