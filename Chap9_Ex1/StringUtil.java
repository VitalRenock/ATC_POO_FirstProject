package Chap9_Ex1;

public class StringUtil {

    /**
     * Permet de capitaliser (1e lettre en majuscule, le reste du
     * texte en minuscule. Ex : « toTO » devient « Toto ») un texte.
     *
     * @param string string à capitaliser.
     * @return string capitalisé.
     */
    public static String capitalize(String string) {

        String strToReturn = null;
        if (string != null && !string.isBlank()) {
            strToReturn = string.substring(0,1).toUpperCase();
            strToReturn += string.substring(1, string.length()).toUpperCase();
        }

        return strToReturn;
    }

    /**
     * Permet de compter le nombre d'occurrence d'une lettre dans un texte.
     *
     * @param text Texte à parcourir.
     * @param letter Lettre à rechercher
     * @return nombre d'occurence trouvée.
     */
    public static int countLetter(String text, char letter) {

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                count++;
            }
        }

        return count;
    }

}
