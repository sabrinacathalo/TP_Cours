package tp.got;

import java.util.ArrayList;

public class Clan {
	String nom;
	ArrayList<Personne> membres;

	public Clan(String nom) {
		this.nom=nom;
		membres=new ArrayList<Personne>();
	}

	public void addMembre(Personne p) {
		membres.add(p);
	}

	public void afficher() {

		for(Personne p : membres) {
			p.afficherPedigre();
		}
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println(toString());
	}

	public String toString() {
		String res="digraph {\n";
		for(Personne p : membres) {
			res += p;//appelle le toString() de Personne
		}
		res+="}";
		
		return res;
	}
	
	public static void main(String args[]) {
		Clan targaryen = new Clan("Targaryen");

		Personne maekarI=new Personne("MaekarI");
		Personne masterAemon=new Personne("MasterAemon", maekarI, null, null);
		Personne aegonV=new Personne("AegonV", maekarI, null, null);
		Personne jaehaerysII=new Personne("JaehaerysII", aegonV, null, null);
		Personne rhaelle=new Personne("Rhaelle", aegonV, null, null);
		Personne ormund=new Personne("Ormund", null, null, rhaelle);
		Personne steffon=new Personne("Steffon", ormund, rhaelle, null);
		Personne aerysII=new Personne("AerysIITheMad", jaehaerysII, null, null);
		Personne rhaegar=new Personne("Rhaegar", aerysII, null, null);
		Personne viserys=new Personne("Viserys", aerysII, null, null);
		Personne daenerys=new Personne("Daenerys", aerysII, null, null);
		Personne lyanna=new Personne("Lyanna", null, null, rhaegar);
		Personne jon=new Personne("Jon", rhaegar, lyanna, null);
		Personne aegon=new Personne("Aegon", rhaegar, null, null);

		targaryen.addMembre(maekarI);
		targaryen.addMembre(masterAemon);
		targaryen.addMembre(aegonV);
		targaryen.addMembre(jaehaerysII);
		targaryen.addMembre(ormund);
		targaryen.addMembre(steffon);
		targaryen.addMembre(aerysII);
		targaryen.addMembre(rhaegar);
		targaryen.addMembre(viserys);
		targaryen.addMembre(daenerys);
		targaryen.addMembre(lyanna);
		targaryen.addMembre(jon);
		targaryen.addMembre(aegon);

		targaryen.afficher();
	}
}
