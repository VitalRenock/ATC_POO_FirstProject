package Revision_Ex4;

public class Gite extends Logement {

    //region Properties

    int fraisEntretien;

    //endregion

    //region Constructors

    public Gite(String prixJour, String nbreEtoile, Localisation localisation, int fraisEntretien) {
        super(prixJour, nbreEtoile, localisation);
        this.fraisEntretien = fraisEntretien;
    }

    //endregion

    //region Getters / Setters

    public int getFraisEntretien() {
        return fraisEntretien;
    }

    public void setFraisEntretien(int fraisEntretien) {
        this.fraisEntretien = fraisEntretien;
    }

    //endregion

    //region Methods

    @Override
    public String toString() {
        String returnValue = "\nType de logement : Gîte";
        returnValue += super.toString();

        return returnValue;
    }

    @Override
    protected int calculerPrixLogement() {
        return Integer.parseInt(getPrixJour()) + getFraisEntretien();
    }

//endregion
}
