
package tp;

import java.util.ArrayList;

public class Clan {	
	public static void main(String[]  argv) {
		ArrayList<String> Targaryen = new ArrayList<String>();
		
		Personne p1 = new Personne("Maekar I", null, null, null);
		Personne p2_1 = new Personne("Maeter aemon", "Maekar I", null, null);
		Personne p2_2 = new Personne("Aegon V", "Maekar I", null, null);
		Personne p2_2_1 = new Personne("Jaeherys II", "Aegon V", null, null);
		Personne p2_2_2 = new Personne("Rhaelle", "Aegon V", null, null);
		Personne p2_2_1_1 = new Personne("Aerys II the mad", "Jaeherys II", null, null);
		Personne p2_2_1_1_1 = new Personne("Rhaegar", "Aerys II the mad", null, null);
		Personne p2_2_1_1_2 = new Personne("Daenerys", "Aerys II the mad", null, null);
		Personne p2_2_1_1_3 = new Personne("Viserys", "Aerys II the mad", null, null);
		
		Targaryen.add(p1.getNom());
		Targaryen.add(p2_1.getNom());
		Targaryen.add(p2_2.getNom());
		Targaryen.add(p2_2_1.getNom());
		Targaryen.add(p2_2_2.getNom());
		Targaryen.add(p2_2_1_1.getNom());
		Targaryen.add(p2_2_1_1_1.getNom());
		Targaryen.add(p2_2_1_1_2.getNom());
		Targaryen.add(p2_2_1_1_3.getNom());
		
		System.out.println(Targaryen);
	}
}
