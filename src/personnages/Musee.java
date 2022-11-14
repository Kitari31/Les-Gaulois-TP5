package personnages;

public class Musee {
	private String nom;
	private Trophee[] tableau = new Trophee[200];
	private int nbTrophee = 0;
	
	public Musee(String nom) {
		this.nom = nom;
	}
	public void donnerTrophees(Gaulois donateur, Equipement trophee) {
		tableau[nbTrophee]= new Trophee(donateur,trophee);
	}
	
	private void donnerTrophee(Gaulois donateur, Equipement trophee) {
		tableau[nbTrophee]= new Trophee(donateur,trophee);
		nbTrophee += 1;
	}
}
