package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Romain minus;
		Gaulois ast�rix;
		ast�rix=new Gaulois("Asterix",8);
		minus=new Romain("Minus",6);
		Druide Panomarix;
		Gaulois Ob�lix;
		Ob�lix=new Gaulois("Ob�lix",6);
		Panomarix= new Druide("Panomarix",5,10);
		Panomarix.preparerPotion();
		Panomarix.booster(Ob�lix);
		Ob�lix.parler("Par B�l�nos, ce n'est pas juste !");
		ast�rix.boirePotion(6);
		ast�rix.parler("Bounjour");
		minus.parler("UN GAU... UN GAUGAU...");
		ast�rix.frapper(minus);
		ast�rix.frapper(minus);
		ast�rix.frapper(minus);
		
		
	}

}
