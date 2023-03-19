package _MemoJava;

public class MemoJava {

    //region VARIABLES

    boolean monBool = false;

    byte monByte = 17;
    short monShort = 1987;
    int monInt = 5;
    long monLong = 100;
    float monFloat = 3.14f;
    double monDouble = 17.91987d;

    char monChar = 200;     // Voir tableau Unicode
    String monString = "Renaud";

    //endregion

    //region CONSTANTES

    final int maConstante = 2022;

    //endregion

    //region TABLEAUX

    int[] monTableauInt = {17, 9, 87};
    String[] monTableauString = {"Renaud", "Xavier", "Nadine", "Angelo"};

    // Re-déclarer un tableau existant
//    monTableauInt = new int[]{11,13,17,19,23,29};
//
//    // Parcourir Tableau
//    for ( int i=0; i < monTableauInt.length; i++ ) {
//        System.out.println( monTableauInt[ i ] );
//    }
//    for (int élément : monTableauInt)
//    {
//        // traitement
//    }

    //endregion

    //region OPÉRATEURS

    // Les opérateurs de calcul
    // (+) (-) (*) (/) (=)

    // Les opérateurs d'assignation
    // (+=) (-=) (*=) (/=)

    // Les opérateurs d'incrémentation
    // (++) (--)

    // Les opérateurs de comparaison
    // (<) (<=) (>) (>=) (==) (!=)

    // Les opérateurs logiques
    // (||) (&&) (!)


    //endregion

    //region CONDITIONS



    //endregion

    //region BOUCLES

    // La boucle For
//    for (int i = 0; i < 5; ++i)
//    {
//        System.out.println("Bonjour");
//    }


    //endregion

    //region TERNAIRES

    String str = 1 > 0 ? "Positif"  : "Négatif";

    //endregion



    //region MÉTHODES



    //endregion

    //region La classe MAIN

    // La classe main est le point de départ obligatoire d'une classe Java.

    public static void main(String[] args) {

    }

    //endregion

    //region CONSTRUCTEUR

    public MemoJava() {

    }

    //endregion

    //region xxx



    //endregion

    //region xxx



    //endregion

    //region xxx



    //endregion

    //region xxx



    //endregion

}

//region CLASSES

class Personne {

    //region Properties
    private String Nom = "";
    private String Prenom = "";
    //endregion

    //region Constructors

    // Constructeur par défaut.
    public Personne() {};

    // Constructeur spécifié
    public Personne(String nom, String prenom) {
        this.Nom = nom;
        this.Prenom = prenom;
    }
    //endregion

    //region Methods
    public void GetName() {}
    //endregion
}

class Employe extends Personne {

    //region Properties
    public int Matricule= 0;
    //endregion

    //region Constructors
    public Employe(String nom, String prenom, int matricule) {

        // Appelle du Constructeur Parent
        super();

        this.Matricule = matricule;
    }
    //endregion

    //region Methods
    public void GetInfos() {
        GetName();
    }

    // Redéfinition de la méthode parent "GetName"
    public void GetName() {
        //...
    }
    //endregion
}

//endregion


//---------------------------------

//region Properties

//endregion

//region Getters / Setters

//endregion

//region Constructors

//endregion

//region Methods

//endregion
