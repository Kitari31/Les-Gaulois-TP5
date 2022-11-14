package histoire;

import personnages.*;

public class Scenario {

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois obelix = new Gaulois("Obélix",8);
		Gaulois asterix = new Gaulois("Astérix",13);
		Romain minus = new Romain("Minus",5);
		Musee musee = new Musee("Musee des gaulois");
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		System.out.println(minus.sEquiper(Equipement.CASQUE));
		System.out.println(minus.sEquiper(Equipement.BOUCLIER));	
		asterix.frapper(minus);
		asterix.faireUneDonnation(musee);
	}

}