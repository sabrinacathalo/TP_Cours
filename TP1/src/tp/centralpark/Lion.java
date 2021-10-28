package tp.centralpark;

public class Lion extends Mammifere {
	public Lion() {
		super();
	}
	
	public Lion(String nom, int age) {
		super(nom, age);
	}
	
	public void crier() {
		System.out.println("Roar");
	}
}
