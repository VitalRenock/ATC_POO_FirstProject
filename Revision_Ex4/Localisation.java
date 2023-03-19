package Revision_Ex4;

public class Localisation {

    //region Properties

    private String pays, ville;
    private int departement;

    //endregion

    //region Constructors

    public Localisation(String pays, String ville, int departement) {
        this.pays = pays;
        this.ville = ville;
        this.departement = departement;
    }

    //endregion

    //region Getters / Setters

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getDepartement() {
        return departement;
    }

    public void setDepartement(int departement) {
        this.departement = departement;
    }

    //endregion

    //region Methods

    public String toString() {

        String returnValue = "Localisation : " + getPays();
        returnValue += "\nDépartement : " + getDepartement();
        returnValue += "\nVille : " + getVille();

        return returnValue;
    }

    public int calculerPrixLogement() {

        return 0;
    }

    //endregion

}
