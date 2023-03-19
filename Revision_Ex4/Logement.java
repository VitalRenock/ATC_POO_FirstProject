package Revision_Ex4;

public abstract class Logement {

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
        String returnValue = getLocalisation().toString();
        returnValue += "\nPrix total par Jour : " + calculerPrixLogement();
        returnValue += "\nNombre d'étoile(s) : " + getNbreEtoile();

        return returnValue;
    }

    protected abstract int calculerPrixLogement();

    //endregion
}
