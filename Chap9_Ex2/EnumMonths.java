package Chap9_Ex2;

public enum EnumMonths {

    //region Properties

    JANUARY("Janvier", "Janv"),
    FEBRUARY("Février", "Févr"),
    MARCH("Mars", "Mars"),
    APRIL("Avril", "Avri"),
    MAY("Mai", "Mai"),
    JUNE("Juin", "Juin"),
    JULY("Juillet", "Juil"),
    AUGUST("Août", "Août"),
    SEPTEMBER("Septembre", "Sept"),
    OCTOBER("Octobre", "Octo"),
    NOVEMBER("Novembre", "Nove"),
    DECEMBER("Décembre", "Déce");


    private String text;
    private String shortcut;

    //endregion

    //region Constructors

    EnumMonths(String text, String shortcut) {
        this.text = text;
        this.shortcut = shortcut;
    }

    //endregion

    //region Getters / Setters

    public String getText() {
        return text;
    }

    public String getShortcut() {
        return shortcut;
    }

    //endregion

}
