package Chap8_Ex1;

public class Programmeur extends Employe
{
    //region Attributs
    private String projet;
    //endregion

    //region Getters / Setters
    public String getProjet() {
        return projet;
    }

    public void setProjet(String projet) {
        this.projet = projet;
    }
    //endregion

    //region Constructeurs
    public Programmeur(String nom, String prenom, int matricule, String projet) {
        super(nom, prenom, matricule);
        setProjet(projet);
    }
    //endregion

    //region Méthodes
    public void affiche()
    {
        super.affiche();
        System.out.println("Projet: " + getProjet());
    }

    public void changeProjet(String projet)
    {
        setProjet(projet);
    }
    //endregion
}
