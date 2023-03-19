package Revision_Ex3;

public class Secretaire extends Employe implements ISecretariat {

    //region Properties

    private String horaire;

    //endregion

    //region Constructors

    public Secretaire() {
        setProfession("Secrétaire");
    }

    //endregion

    //region Getters / Setters

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    //endregion

    //region Methods

    @Override
    public void afficheTache() {
        super.afficheTache();
        System.out.println("Je m'occupe des tâches administratives.");
    }

    @Override
    public void afficheHoraire() {
        System.out.println("Je travaille à " + getHoraire());
    }

    //endregion
}
