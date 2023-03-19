package Chap9_Ex1;

public class Test_String {

// - Méthode Main

    public static void main(String[] args) {

        // Demande du nombre de personne à traiter
        System.out.println("Entrez le nombre de personnes à traiter : ");
        int numberOfTreatments = Clavier.lireInt();

        // Demande de la lettre à rechercher
        char searchedLetter;
        System.out.println("Veuillez introduire le caractère à chercher :");
        searchedLetter = Clavier.lireString().charAt(0);


        // Demande du prénom (X fois dépendant du 1e point)
        String[] peoples = new String[numberOfTreatments];
        for (int i = 0; i < peoples.length; i++) {

            System.out.println("Veuillez le prénom n°" + (i + 1) + ":");
            peoples[i] = Clavier.lireString();
        }

        // Traitements (capitalisation et nombre d’occurrence de la lettre)
        // Affichage du résultat
        for (int i = 0; i < peoples.length; i++) {

            enum Jour { lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche }
            Jour jour = Jour.dimanche;




            System.out.println(StringUtil.capitalize(peoples[i]) + " : " + StringUtil.countLetter(peoples[i], searchedLetter));
        }
    }

}


