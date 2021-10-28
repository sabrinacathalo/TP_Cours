package tp.centralpark;

public class Ovipare extends Animal {
	
	public Ovipare() {
		super();
	}
	
	public Ovipare(String nom, int age) {
		super(nom, age);
	}
	
	public Ovipare pondre() {
		return new Ovipare();
	}
}
