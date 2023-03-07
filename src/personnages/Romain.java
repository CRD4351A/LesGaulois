package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
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
		return "Le romain" + nom + ":";
	}
	public void recevoirCoup(int forceCoup) {
		force-= forceCoup;
		if (force>0) {
			parler("Aie");
			
		} else {
			parler("j'abandonne...");
		}
	}
	 public static void main(String[] args) {
		 Romain julio;
		 julio=new Romain("julio",4);
		 julio.prendreParole();
		 julio.parler("ahhhh");
		 julio.recevoirCoup(5);
		 
	 }
}

