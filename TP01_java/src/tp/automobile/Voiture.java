package tp.automobile;

public class Voiture {
	private int distanceParcourue;
	private int tailleReservoir;
	private float reservoir;
	private float consommation;
	private static int TAILLE_RESERVOIR_DEFAUT = 35;
	private static float CONSOMMATION_DEFAUT = 1;
	
	public Voiture() {
		this.tailleReservoir = TAILLE_RESERVOIR_DEFAUT;
		this.consommation = CONSOMMATION_DEFAUT;
	}
	
	public Voiture(int tailleReservoir) {
		this.tailleReservoir = tailleReservoir ;
		this.consommation = CONSOMMATION_DEFAUT;
		if (this.tailleReservoir == 0) {
			this.tailleReservoir = TAILLE_RESERVOIR_DEFAUT;
		}
	}
	
	public Voiture(int tailleReservoir, float consommation) {
		this.tailleReservoir = tailleReservoir;
		this.consommation = consommation;
		if (this.tailleReservoir == 0) {
			this.tailleReservoir = TAILLE_RESERVOIR_DEFAUT;
		}
		if (this.consommation == 0) {
			this.consommation = CONSOMMATION_DEFAUT;
		}
	}
	
	public void avancer(int distance) throws ReservoirVideException{	
		try {
			this.distanceParcourue =+ distance;
			this.reservoir = this.reservoir - ((distance/100)*this.consommation);
			if(this.reservoir <= 0) {
				throw new ReservoirVideException();
			}
		}catch(ReservoirVideException rve){
			System.out.println ("Le réservoir est vide.");
		}	
	}
	
	public void fairePlein(int volume) throws ReservoirPleinException{
		try {
			this.reservoir =+ volume;
			if(this.reservoir > this.tailleReservoir) {
				throw new ReservoirPleinException();
			}
		}catch(ReservoirPleinException rve){
			System.out.println ("Le réservoir est plein.");
		}
	}
	
	public int getDistanceParcourue() {return this.distanceParcourue;}
	
	public int getTailleReservoir() {return this.tailleReservoir;}
	
	public float getReservoir() {return this.reservoir;}
	
	public static void main(String[]  argv) throws ReservoirPleinException, ReservoirVideException {
		Voiture voiture1 = new Voiture();
		Voiture voiture2 = new Voiture(50);
		Voiture voiture3 = new Voiture(70, 05);
		voiture1.fairePlein(35);
		voiture1.avancer(100);
		int v1 = voiture1.getDistanceParcourue();
		float v1_1 = voiture1.getReservoir();
		float v_1_1_1 = voiture1.getTailleReservoir();
		System.out.println ("Voiture1: Distance " + v1 + " Réservoir " + v1_1 + " Taille " + v_1_1_1);
		voiture2.fairePlein(51);
		voiture2.avancer(100);
		int v2 = voiture2.getDistanceParcourue();
		float v2_2 = voiture2.getReservoir();
		float v2_2_2 = voiture2.getTailleReservoir();
		System.out.println ("Voiture2: Distance " + v2 + " Réservoir " + v2_2+ " Taille " + v2_2_2);
		voiture3.fairePlein(0);
		voiture3.avancer(95);
		int v3 = voiture3.getDistanceParcourue();
		float v3_3 = voiture3.getReservoir();
		float v3_3_3 = voiture3.getTailleReservoir();
		System.out.println ("Voiture3: Distance " + v3 + " Réservoir " + v3_3+ " Taille " + v3_3_3);
	}

}
