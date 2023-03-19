package Revision_Ex3;

public class Validation {

    //region Methods

    public static boolean validateNiss(String niss) {

        if (niss.length() != 13)
            return false;

        if (!parseInt(niss.substring(0,6)))
            return false;

        if (niss.charAt(6) != '-')
            return false;

        if (!parseInt(niss.substring(7,10)))
            return false;

        if (niss.charAt(10) != '.')
            return false;

        if (!parseInt(niss.substring(11)))
            return false;

        return true;
    }

    public static boolean validateMatricule(String matricule) {

        if (matricule.length() != 6)
            return false;

        for (int i = 0; i < 3; i++)
            if (Character.getType(matricule.charAt(i)) != 1)
                return false;

        return parseInt(matricule.substring(3));
    }

    public static boolean parseInt(String text) {

        try {
            Integer.parseInt(text);
            return true;
        }
        catch (NumberFormatException ex) {

            return false;
        }
    }

    //endregion

}
