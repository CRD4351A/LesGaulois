package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois villageios[];
	private int nbvillageois=0;
	private int nbvillageiosMax;
	
	
	public Village(String nom,int nbvillageiosMax) {
		this.nom = nom;
		this.nbvillageiosMax = nbvillageiosMax;
		villageios = new Gaulois[nbvillageiosMax];
		
	}
	public void ajouterHabitant(Gaulois gaulois) {
		if(nbvillageois<nbvillageiosMax) {
			villageios[nbvillageois] = gaulois;
			nbvillageois +=1;
		}
	}
	public Gaulois trouverHabitant(int numero) {
		return villageios[numero];
		
		
	}
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public void afficherVillageois(Chef chef) {
		System.out.println("Dans le village du chef"+chef.getNom()+"vivent les legendaires gauloise :");
		for (int i=0;i<nbvillageois;i++) {
			System.out.println("_"+villageios[i].getNom());
		}
		
		
		
		
	}
	 public static void main(String[] args) {
		 Village village = new Village("village des ireductibles",30);
		 //Gaulois gaulois = village.trouverHabitant(30);
		 Chef Abraracourcix = new Chef("Abraracourcix",6,1,village);
		 village.setChef(Abraracourcix);
		 Gaulois astérix = new Gaulois("astérix",8);
		 village.ajouterHabitant(astérix);
		 Gaulois Obélix = new Gaulois("Obélix",25);
		 village.ajouterHabitant(Obélix);
		 village.afficherVillageois(Abraracourcix);
		 //Gaulois gaulois = village.trouverHabitant(1);
		 //System.out.println(gaulois);
		 
	 }
	
}
