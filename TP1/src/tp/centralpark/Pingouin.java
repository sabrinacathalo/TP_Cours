package tp.centralpark;

public class Pingouin extends Ovipare {
	public Pingouin() {
		super();
	}
	
	public Pingouin(String nom, int age) {
		super(nom, age);
	}

	public void crier() {
		System.out.println(getName());
	}
	
	public Pingouin pondre() {
		return new Pingouin();
	}
}
