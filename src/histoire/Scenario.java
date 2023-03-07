package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Romain minus;
		Gaulois astérix;
		astérix=new Gaulois("Asterix",8);
		minus=new Romain("Minus",6);
		astérix.parler("Bounjour a tous");
		minus.parler("UN GAU... UN GAUGAU...");
		astérix.frapper(minus);
		astérix.frapper(minus);
		astérix.frapper(minus);
		
	}

}
