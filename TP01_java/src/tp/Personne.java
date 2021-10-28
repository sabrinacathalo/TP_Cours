package tp;


public class Personne
{
 private   String nom;
 private String nomPere;
 private String nomMere;
 private String nomConjoint;

   public  Personne (String pNom, String pPere, String pMere, String pConjoint)
   {
        this.nom = pNom;
        this.nomPere = pPere;
        this.nomMere = pMere;
        this.nomConjoint = pConjoint;
   }

   public  String getNom () { return this.nom; }

   public  void setNom (String pNouvNom) { this.nom = pNouvNom; }
   
   public  String getPere () { return this.nomPere; }
   public  String getMere () { return this.nomMere; }
   public  String getConjoint () { return this.nomConjoint; }
}
