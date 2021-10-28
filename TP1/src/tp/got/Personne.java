package tp.got;

public class Personne {
	private String nom;
	private Personne pere, mere, conjoint;
	
	public Personne(String nom) {
		this.nom=nom;
	}
	
	public Personne(String nom, Personne pere, Personne mere, Personne conjoint) {
		this(nom);
		this.pere=pere;
		this.mere=mere;
		this.conjoint=conjoint;
		
		if(conjoint!=null) {
			conjoint.setConjoint(this);
		}
	}
	
	public void setConjoint(Personne conjoint) {
		this.conjoint=conjoint;
	}
	
	public String getNom() {
		return nom;
	}
	
	public Personne getPere() {
		return pere;
	}
	
	public void afficherPedigre() {
		System.out.print(this.nom);
		if(conjoint!=null) {
			System.out.print(", conjoint de "+conjoint.getNom());
		}
		if(pere!=null) {
			System.out.print(", fils de "+pere.getNom());
			if(pere.getPere()!=null) {
				System.out.print(", petit fils de "+pere.getPere().getNom());
			}
		}
		System.out.println();
	}
	
	public String toString() {
		String res="";
		if(conjoint!=null) {
			res += nom+"->"+conjoint.getNom()+"[dir=\"both\"]" + "\n";
		}
		if(pere != null) {
			res += pere.getNom() + "->" + nom + "\n";
		}
		if(mere != null) {
			res += mere.getNom()+"->"+nom + "\n";
		}
		return res;
	}
}
