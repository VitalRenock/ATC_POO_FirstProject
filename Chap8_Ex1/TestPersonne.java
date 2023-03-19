package Chap8_Ex1;

public class TestPersonne {

    public static void main(String[] args) {

        // Créer un objet Personne + appel de la méthode affiche.
        Personne personne = new Personne("Brigode", "Renaud");
        System.out.println("Instance : " + (personne instanceof Personne ? "Personne" : "Aucun"));
        personne.affiche();

        System.out.println("-------------------------------------------------------");

        // Créer un objet Employe + appel de la méthode affiche.
        // Changer le nom et prenom + appel de la méthode affiche.
        Employe employe = new Employe("Brigode", "Renaud", 87);
        employe.affiche();
        employe.changeMatricule(92);
        employe.affiche();

        System.out.println("-------------------------------------------------------");

        // Créer un objet Programmeur + appel de la méthode affiche.
        // Changer le matricule et le projet + appel de la méthode affiche.
        Programmeur programmeur = new Programmeur("Brigode", "Renaud", 87, "Java");
        programmeur.affiche();
        programmeur.changeMatricule(92);
        programmeur.changeProjet("C#");
        programmeur.affiche();
    }


}
