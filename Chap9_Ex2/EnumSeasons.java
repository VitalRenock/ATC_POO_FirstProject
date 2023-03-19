package Chap9_Ex2;

public enum EnumSeasons {

    //region Properties
    Winter("Hiver"),
    Spring("Printemps"),
    Summer("Eté"),
    Autumn("Automne");

    private String text;

    //endregion

    //region Constructors

    EnumSeasons(String text) {
        this.text = text;
    }

    //endregion

    //region Getters

    public String getText() {
        return text;
    }

    //endregion
}
