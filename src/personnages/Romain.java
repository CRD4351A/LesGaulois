package personnages;

public class Romain {
	private String nom;
	private int force;
	
	private int nbEquipement = 0;
	private Equipement[] equipements;
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// pr�condition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force > 0)
		{
			 parler("A�e");
		 } else {
		 equipementEjecte = ejecterEquipement();
		 parler("J'abandonne...");
		 }
		//post condition la force � diminuer
		assert force < oldForce;
		return equipementEjecte;
		}

	
	private int calculResistanceEquipement(int forceCoup) {
  String texte;
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
		texte += "\nMais heureusement, grace � mon �quipement saforce est diminu� de ";
		for (int i = 0; i < nbEquipement;) {
		if ((equipements[i] != null &&
		equipements[i].equals(Equipement.BOUCLIER)) == true) {
		resistanceEquipement += 8;
		} else {
		System.out.println("Equipement casque");
		resistanceEquipement += 5;
		}
		i++;
		}
		texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}

	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'�quipement de " + nom.toString() + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
		if (equipements[i] == null) {
		} else {
		equipementEjecte[nbEquipementEjecte] =
		equipements[i];
		nbEquipementEjecte++;
		equipements[i] = null;
		}
		}
		return equipementEjecte;
		}

	
	
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
	
//	public void recevoirCoup(int forceCoup) {
//		assert force >0;
//		int t = force;
//		force-= forceCoup;
//		if (force>0) {
//			parler("Aie");
//		assert force<t;
//			
//		} else {
//			parler("j'abandonne...");
//		}
//	}
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

