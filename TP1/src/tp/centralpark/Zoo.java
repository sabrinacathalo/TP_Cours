package tp.centralpark;

import java.util.ArrayList;

public class Zoo {
	public ArrayList<Animal> residents;
	
	public Zoo() {
		residents = new ArrayList<Animal>();
	}
	
	public static void main(String args[]) {
		Zoo centralPark = new Zoo();
		centralPark.residents.add(new Lion("Alex", 20));
		centralPark.residents.add(new Zebre("Marty", 15));
		centralPark.residents.add(new Hippopotame("Gloria", 30));
		centralPark.residents.add(new Girafe("Melman", 35));
		
		centralPark.residents.add(new Pingouin("Commandant", 10));
		centralPark.residents.add(new Pingouin("Kowalski", 10));
		centralPark.residents.add(new Pingouin("soldat", 10));
		centralPark.residents.add(new Pingouin("Rico", 10));
		
		for(Animal a : centralPark.residents) {
			a.crier();
		}
	}
}
