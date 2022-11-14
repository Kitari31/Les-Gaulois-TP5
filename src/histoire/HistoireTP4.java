package histoire;

import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54,0);
		prof.direBonjour();
		prof.acheter("kombucha",12);
		prof.boire();
		prof.acheter("jeu",2);
		prof.acheter("Kimono",50);
		Commercant marco = new Commercant("Marco",50);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoirArgent(15);
		marco.boire();
		Yakuza yaku = new Yakuza("Yaku Le Noir","whiskey",30,"Warsong",4);
		yaku.direBonjour();
		yaku.Extorquer(marco);
		Ronin roro = new Ronin("Roro","shochu",60,1);
		roro.donner(marco);
		roro.provoquer(yaku);
	}
}
