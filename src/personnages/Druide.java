package personnages;
import java.util.Random;
public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bounjour,je suis le druide " + nom + " et ma potion peut aller d une force " + effetPotionMin+" a "+effetPotionMax+".");
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+  texte + ">>");
	}
	private String prendreParole() {
		return "Le druide" + nom + ":";
	}
	public int preparerPotion() {
		Random num= new Random();
		forcePotion = num.nextInt(effetPotionMax);
			while (forcePotion<effetPotionMin) {
				forcePotion = num.nextInt(effetPotionMax);
			}
			
		
			if(forcePotion>7) {
		parler("J'ai pr�par� une super potion de force "+forcePotion);
			}
			else {
				parler("Je n'ai pas trouv� tous les ingr�dients,ma potion est seulement de force "+forcePotion);
						
			}
		return forcePotion;
	}
	public void booster(Gaulois gaulois) {
		
		if(gaulois.getNom() =="Ob�lix") {
			parler("Non, Ob�lix !... Tu n'auras pas de potion magique !");
		}
		
	}
	public static void main(String[] args) {
		Druide panomarix;
		panomarix=new Druide("Panomarix",5,10);
		panomarix.preparerPotion();
		
		
	}
}

