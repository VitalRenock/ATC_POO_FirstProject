package Revision_Ex3;

public class Directeur extends Employe {

    //region Constructors

    public Directeur() {
        setProfession("Directeur");
    }

    //endregion

    //region Methods

    @Override
    public void afficheTache() {
        super.afficheTache();
        System.out.println("Je dirige l'école");
        System.out.println("------------------------------------------");

    }

    //endregion

}
