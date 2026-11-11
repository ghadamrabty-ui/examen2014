package EXAMAN2014;

public class test {

    public static void main(String[] args) {

        Conditionage c = new Conditionage(12);

        Attraction a1 = new Attraction("Jeu1", 10, c);

        Paecattrattraction parc = new Paecattrattraction("MonParc", 3);
        parc.ajouteAttraction(a1);

        Personne ali = new Personne("Ali", 20, 170);
        Personne bob = new Personne("Bob", 10, 130);

        try {
            a1.utilise(ali);   // accepté
            a1.utilise(bob);   // refusé : AccesInterditException
        } catch (AccesInterditException e) {
            System.out.println(e.getMessage());
        }

        ali.affiche();
        parc.affiche();
        System.out.println("Recette totale = " + parc.getRecette());
    }
}