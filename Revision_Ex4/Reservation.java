package Revision_Ex4;

public class Reservation {

    //region Properties

    String nomPersonne;
    Logement logement;
    int duree;

    //endregion

    //region Constructors

    public Reservation(String nomPersonne, Logement logement, int duree) {
        this.nomPersonne = nomPersonne;
        this.logement = logement;
        this.duree = duree;
    }

    //endregion

    //region Getters / Setters

    public String getNomPersonne() {
        return nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public Logement getLogement() {
        return logement;
    }

    public void setLogement(Logement logement) {
        this.logement = logement;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    //endregion

    //region Methods

    public String toString() {

        try {
            String returnValue = "-----------------------------------";
            returnValue += "\nNom : " + getNomPersonne();
            returnValue += "\n";
            returnValue += getLogement().toString();
            returnValue += "\nDurée : " + getDuree();
            returnValue += "\n";
            returnValue += "\n" + controler();
            returnValue += "\n-----------------------------------";

            return returnValue;
        }
        catch (Exception exception) {
            return exception.getMessage();
        }

    }

    public String controler() throws DureeException {

        try {
            if (getDuree() > 7)
                throw new DureeException("Réservation refusée: Durée supérieure à 1 semaine");
            return "Réservation : OK (maximum 1 semaine)";
        }
        catch (DureeException exception) {
            return exception.getMessage();
        }
    }
    public void controler(int dureeMax) throws DureeException {
        if (getDuree() > dureeMax)
            throw new DureeException();
    }

    //endregion
}
