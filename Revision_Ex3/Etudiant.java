package Revision_Ex3;

public class Etudiant extends Personne {

    //region Properties

    private Cours cours;
    private String annee;

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

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    //endregion

    //region Methods

    @Override
    public void afficheTache() {
        super.afficheTache();
        System.out.println("Je suis dans le cours " + getCours() + " et dans l'année " + getAnnee());
    }

    //endregion

}
