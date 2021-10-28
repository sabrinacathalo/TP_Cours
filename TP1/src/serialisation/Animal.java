package serialisation;

import java.io.Serializable;

public class Animal implements Serializable {
	private static final long serialVersionUID = 1855740869716533536L;
	
	private String name;
	private int age;
	
	public Animal() {
		this("Animal sauvage", 0);
	}
	
	public Animal(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	
	public void crier() {
		System.out.println("cri");
	}
	
	public boolean estMammifere() {
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
