package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>0;
		
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+  texte + ">>");
	}
	private String prendreParole() {
		return "Le romain" + nom + ":";
	}
	public void recevoirCoup(int forceCoup) {
		assert force >0;
		int t = force;
		force-= forceCoup;
		if (force>0) {
			parler("Aie");
		assert force<t;
			
		} else {
			parler("j'abandonne...");
		}
	}
	 public static void main(String[] args) {
		 Romain julio;
		 Romain minus;
		 minus=new Romain("minus",6);
		 julio=new Romain("julio",4);
		 julio.prendreParole();
		 julio.parler("ahhhh");
		 julio.recevoirCoup(5);
		 
	 }
}

