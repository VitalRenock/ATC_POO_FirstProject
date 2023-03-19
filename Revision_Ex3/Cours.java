package Revision_Ex3;

public enum Cours {

    //region Properties

    INFORMATIQUE("Informatique"),
    COMPTABILITE("Comptabilité"),
    ELECTROMECANIQUE("Électro-mécanique"),
    SECONDAIRE("Secondaire");

    private String text;

    //endregion

    //region Constructors

    Cours(String text) {
        this.text = text;
    }

    //endregion

    //region Getters / Setters

    public String getText() {
        return text;
    }

    //endregion

}
