package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Romain minus;
		Gaulois ast�rix;
		ast�rix=new Gaulois("Asterix",8);
		minus=new Romain("Minus",6);
		ast�rix.parler("Bounjour a tous");
		minus.parler("UN GAU... UN GAUGAU...");
		ast�rix.frapper(minus);
		ast�rix.frapper(minus);
		ast�rix.frapper(minus);
		
	}

}
