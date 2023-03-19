package Revision_Ex4;

public class Logement {

    //region Properties

    private String prixJour, nbreEtoile;
    private Localisation localisation;

    //endregion

    //region Constructors

    public Logement(String prixJour, String nbreEtoile, Localisation localisation) {
        this.prixJour = prixJour;
        this.nbreEtoile = nbreEtoile;
        this.localisation = localisation;
    }


    //endregion

    //region Getters / Setters

    public String getPrixJour() {
        return prixJour;
    }

    public void setPrixJour(String prixJour) {
        this.prixJour = prixJour;
    }

    public String getNbreEtoile() {
        return nbreEtoile;
    }

    public void setNbreEtoile(String nbreEtoile) {
        this.nbreEtoile = nbreEtoile;
    }

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }

    //endregion

    //region Methods

    public String toString() {
        String returnValue = "Localisation : " + getLocalisation().toString();
        returnValue += "Prix total par Jour : " + getPrixJour();
        returnValue += "Nombre d'étoile(s) : " + getNbreEtoile();

        return returnValue;
    }

    //endregion
}
