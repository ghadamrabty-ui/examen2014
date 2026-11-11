package EXAMAN2014;

public class Conditionage implements Conditionacces{
	private int AgeMin;
	
	
	
	public Conditionage(int AgeMin) {
	    this.AgeMin = AgeMin;
	}
	
	public boolean accesPossible(Personne p) {
	    return p.getage() > AgeMin;
	}
}
