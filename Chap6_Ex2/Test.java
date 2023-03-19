package Chap6_Ex2;

import java.security.InvalidParameterException;

public class Test {

    public static void main(String[] args) {

        try {
            int[] params = displayParamNumber();
            int max = generateParams(params);
            displayResult(max);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void displayWelcome() {

        System.out.println("Entrez un nombre entier : ");
        int iteration = Clavier.lireInt();

        for (int i = 0; i <= iteration; i++) {

        }
    }

    public static int[] displayParamNumber() {

        System.out.println("Entrez un nombre de paramètres (entre 2 et 5) : ");
        int nbParams = Clavier.lireInt();

        int[] params = new int[nbParams];
        for (int i = 0; i < nbParams; i++) {
            params[i] = (int)Math.round(Math.random() * 100);
            System.out.println("Paramètre " + (i + 1) + " = " + params[i]);
        }

        return  params;
    }


    public static int generateParams(int[] params) {

        try {
            Tri tri = new Tri();
            switch (params.length) {
                case 2:
                    return tri.getMax(
                            params[0],
                            params[1]
                    );
                case 3:
                    return tri.getMax(
                            params[0],
                            params[1],
                            params[2]
                    );
                case 4:
                    return tri.getMax(
                            params[0],
                            params[1],
                            params[2],
                            params[3]
                    );
                case 5:
                    return tri.getMax(
                            params[0],
                            params[1],
                            params[2],
                            params[3],
                            params[4]
                    );
                default:
                    throw new InvalidParameterException("ERROR => Le nombre de paramètre doit être compris entre 2 et 5");
            }
        }
        catch (Exception ex){
            throw ex;
        }
    }



    public static void displayResult(int result) {

        System.out.println("Le plus grand nombre est : " + result);
    }

    public static void displayEnd() {
        // Fin de programme de tri
    }

}
