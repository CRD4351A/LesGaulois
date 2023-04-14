package personnages;

public class Romain {
	private String nom;
	private int force;
	private int nbEquipement = 0;
	private Equipement[] equipements;
	

	
	public void  sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat"+getNom()+ " est deja bien protege!");
			break;
		case 1:
			if(equipements[0]==equipement) {
			System.out.println("Le soldat"+getNom()+ " possede deja un "+ equipement+"!");
			break;
			}
			else {
				equipements[1]=equipement;
				nbEquipement+=1;
				System.out.println("Le soldat"+getNom()+ " s'equipe avec un "+ equipement+".");
				break;
			}
		case 0:
			equipements[0]=equipement;
			nbEquipement+=1;
			System.out.println("Le soldat"+getNom()+ " s'equipe avec un " + equipement+".");
			break;
		default:
			break;
		}
		
	}
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		equipements= new Equipement[2];
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
		 minus.sEquiper(Equipement.CASQUE);
		 minus.sEquiper(Equipement.CASQUE);
		 minus.sEquiper(Equipement.BOUCLIER);
		 minus.sEquiper(Equipement.BOUCLIER);
	 }
}

