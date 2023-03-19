package Chap6_Ex1;

public class Conversion {

    static int result[];
    static String resultString;

    // Constructeur
    Conversion () {
        this.result = new int[100];
    }

    public static void main(String[] args) {
        displayWelcome();
    }

    public static void displayWelcome() {
        int choice = 0;
        int number = 0;

        //region Menu de choix

        System.out.println("Programme de conversion de base");
        System.out.println("1 : Décimal -> binaire");
        System.out.println("2 : Décimal -> hexadécimal");

        choice = Clavier.lireInt();
        if (choice != 1 && choice != 2)
            displayWelcome();

        //endregion

        // region Input du nombre à convertir

        System.out.println("Entrez un nombre entier : ");
        number = Clavier.lireInt();

        //endregion

        //region Traitement

        if (choice == 1)
            resultString = decBin(number);
        else if (choice == 2)
            resultString = decHex(number);
        else
            System.out.println("Erreur lors du traitement!");

        //endregion

        //region Affichage du résultat

        displayResult(resultString);

        //endregion
    }

    public static void displayResult(String resultString) {
        System.out.println("Le résultat de la conversion est  : " +resultString);
    }
    public static String decBin(double number) {
        // conversion binaire
        String binResult = "";

        while (number != 0) {

            if ((number % 2) == 0 ) {
                binResult += "0";
                number = Math.floor(number / 2);

                // Debug
                //System.out.println("Nombre : " + number);
            }
            else {
                binResult += "1";
                number = Math.floor(number / 2);

                // Debug
                //System.out.println("Nombre : " + number);
            }
        }
        return binResult;
    }
    public static String decHex(int n) {
        // conversion hexadécimale
//
//        String hexResult = "";
//        double reminder = 0f;
//        int value = 0;
//
//        do {
//            reminder = number % 16;
//            number = Math.floor(number / 16);
//            value += Math.round(reminder);
//            switch (value) {
//                case 10 :
//                    hexResult += "A";
//                    break;
//                case 11 :
//                    hexResult += "B";
//                    break;
//                case 12 :
//                    hexResult += "C";
//                    break;
//                case 13 :
//                    hexResult += "D";
//                    break;
//                default: hexResult += Math.round(reminder);
//            }
//            System.out.println(hexResult);
//        }
//        while (number / 16 != 0);
//
//        return hexResult;
//        int reminder;
//        char hexchars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
//        while (decimal > 0) {
//            reminder = decimal % 16;
//            resultString = hexchars[reminder] + resultString;
//            System.out.println(resultString);
//            decimal = decimal / 16;
//        }
//        return resultString;


// Creating an array to store octal number
        int[] hexNum = new int[100];

        int i = 0;
        while (n != 0) {

        hexNum[i] = n % 16;
        n = n / 16;
        i++;
        }


        for (int j = i - 1; j >= 0; j--) {
            if (hexNum[j] > 9)
                resultString = Integer.toString((char)(55 + hexNum[j]));
            else
                resultString = Integer.toString(hexNum[j]);
        }
        return resultString;
    }


}
