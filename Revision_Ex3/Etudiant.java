package Revision_Ex3;

public class Etudiant extends Personne {

    //region Properties

    private Cours cours;
    private int annee;

    //endregion

    //region Constructors

    public Etudiant() {
        setProfession("Étudiant");
    }

    //endregion

    //region Getters / Setters

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    //endregion

    //region Methods

    @Override
    public void afficheTache() {
        super.afficheTache();
        System.out.println("Cours: " + getCours());
        System.out.println("Année: " + getAnnee());
        System.out.println("------------------------------------------");
    }

    //endregion

}
