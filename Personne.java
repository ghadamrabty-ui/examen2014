package EXAMAN2014;

public class Personne {
	private String nom;
    private int age;
    private int taille;
	
	
 public Personne(String nom,int age,int taille) {
		this.nom=nom;
		this.age=age;
		this.taille=taille;
		
	
	}
 public int getage() {
	 return age;
 }
 public void affiche() {
     System.out.println("Nom : " + nom + ", age : " + age + " ans, taille : " + taille + " cm");
 }
 }
 


