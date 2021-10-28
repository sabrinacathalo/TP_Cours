package tp.madagascar;

import java.util.ArrayList;

public class Animal {
	public String name;
	public int age;
	
	public boolean estMammifere() {
		Pingouin les_pingouins = new Pingouin("les_pingouins");
		if (name == les_pingouins.getNom()) {
			return false;
		}
		return true;
	}
	
	public void crier() {
		
	}
	
	public static void main(String[]  argv) {
		ArrayList<String> Zoo = new ArrayList<String>();
		Lion lion = new Lion("Alex");
		Girafe girafe = new Girafe("Melman");
		Hippopotame hippo = new Hippopotame("Gloria");
		Zebre zebre = new Zebre("Marty");
		Pingouin pingouinC = new Pingouin("Commandant");
		Pingouin pingouinK = new Pingouin("Kowalski");
		Pingouin pingouinS = new Pingouin("soldat");
		Pingouin pingouinR = new Pingouin("rico");
	}
}
