package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Romain minus;
		Gaulois astérix;
		astérix=new Gaulois("Asterix",8);
		minus=new Romain("Minus",6);
		Druide Panomarix;
		Gaulois Obélix;
		Obélix=new Gaulois("Obélix",6);
		Panomarix= new Druide("Panomarix",5,10);
		Panomarix.preparerPotion();
		Panomarix.booster(Obélix);
		Obélix.parler("Par Bélénos, ce n'est pas juste !");
		astérix.boirePotion(6);
		astérix.parler("Bounjour");
		minus.parler("UN GAU... UN GAUGAU...");
		astérix.frapper(minus);
		astérix.frapper(minus);
		astérix.frapper(minus);
		
		
	}

}
