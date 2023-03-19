package Chap7_Ex1;

public class Test {

    public static void main(String[] args) {

        int[] monTableau10 = new int[10];
        int[] monTableau20 = new int[20];

        // Génération des éléments du premier tableau
        generateParam(monTableau10);

        // Affichage du premier tableau
        display(monTableau10);

        // Copie des éléments du premier tableau dans le second
        for (int i = 0; i < monTableau10.length; ++i) {
            monTableau20[i] = monTableau10[i];
        }

        // Génération des autres éléments du second tableau
        generateParam(monTableau20);

        // Affichage du second tableau
        display(monTableau20);
    }

    public static int[] generateParam(int[] tableau)
    {
        for (int i = 0; i < tableau.length; ++i) {
            if (tableau[i] <= 0) {
                tableau[i] = (int)Math.round(Math.random() * 100);
            }
        }
        return tableau;
    }

    public static void display(int[] tableau)
    {
        System.out.println("Affichage : Tableau" + tableau.length);
        for (int i = 0; i < tableau.length; ++i)
        {
            System.out.println("Donnée " + (i + 1) + ": " + tableau[i]);
        }
    }
}
