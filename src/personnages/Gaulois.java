package personnages;
import personnages.Druide;
public class Gaulois {
	private String nom;
	private int force;
	private int effetpotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+  texte + ">>");
	}
	private String prendreParole() {
		return "Le galouis" + nom + ":";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom+" envoie un grand coup dans le machoire de"+romain.getNom());
		romain.recevoirCoup(force/3*effetpotion);
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetpotion=" + effetpotion + "]";
	}
	public void boirePotion(int forcePotion) {
		this.effetpotion=forcePotion;
		parler("Merci Druide , je sens que ma force est "+ effetpotion+ "fois décuplée");
		
		
	}
	
    public static void main(String[] args) {
    	Gaulois asterix;
    	asterix=new Gaulois("Asterix",8);
    	System.out.println(asterix);
    	asterix.prendreParole();
    	asterix.parler("aie");
    	Romain julioo;
    	julioo=new Romain("julio",9);
    	asterix.frapper(julioo);
    	asterix.boirePotion(9);
	}
}
