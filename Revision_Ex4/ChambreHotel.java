package Revision_Ex4;

public class ChambreHotel extends Logement {

    //region Properties

    int prixDejeuner, prixRepas;

    //endregion

    //region Constructors

    public ChambreHotel(String prixJour, String nbreEtoile, Localisation localisation, int prixDejeuner, int prixRepas) {
        super(prixJour, nbreEtoile, localisation);
        this.prixDejeuner = prixDejeuner;
        this.prixRepas = prixRepas;
    }

    //endregion

    //region Getters / Setters

    public int getPrixDejeuner() {
        return prixDejeuner;
    }

    public void setPrixDejeuner(int prixDejeuner) {
        this.prixDejeuner = prixDejeuner;
    }

    public int getPrixRepas() {
        return prixRepas;
    }

    public void setPrixRepas(int prixRepas) {
        this.prixRepas = prixRepas;
    }

    //endregion

    //region Methods

    @Override
    public String toString() {
        String returnValue = "\nType de logement : Chambre d'hôtel";
        returnValue += super.toString();

        return returnValue;
    }

    @Override
    protected int calculerPrixLogement() {
        return Integer.parseInt(getPrixJour()) + getPrixDejeuner() + getPrixRepas();
    }

    //endregion

}
