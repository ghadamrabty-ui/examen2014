package EXAMAN2014;

public class Attraction {
	private String nom;
	private float cout;
	private Conditionage conditionage;
	private int nbpers =0;
	private float recette =0;
	
	public Attraction(String nom,float cout,Conditionage conditionage ) {
		this.nom = nom;
		this.cout = cout;
		this.conditionage = conditionage;
	}
	public void affiche() {
	       System.out.println("Nom : " + nom+"\n Cout : " + cout);
	       System.out.println( " Nombre de personnes : " + nbpers);
	       System.out.println("Recette : " + recette);
	}
	
	public void utilise(Personne p) throws AccesInterditException {
        if (!conditionage.accesPossible(p)) {
            throw new AccesInterditException("Accès interdit à " + " pour " + nom);
        }
        nbpers++;
        recette = recette + cout;
    }
	public float getRecette() {
        return recette;
    }

	
	
	
	}


