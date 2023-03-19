package Revision_Ex1;

public class Test_Personnage {

    public static void main(String[] args) {

        // Garnir un tableau avec 3 'Guerrier', 3 'Medecin' et 3 'Sniper' (utiliser les 3 constructeurs).
        Personnage[] personnages = {
            new Guerrier(),
            new Guerrier("Roger"),
            new Guerrier("Maurice", "à cheval", "une hache"),
            new Medecin(),
            new Medecin("Alice"),
            new Medecin("Camille", "en Jeep", "la chirurgie"),
            new Sniper(),
            new Sniper("Sarah"),
            new Sniper("Julien", "de toit en toit", "un fusil à lunette")
        };

        // Pour chaque élément du tableau, faire l'affichage des attributs qui contiennent une valeur
        for (Personnage personnage : personnages) {

            System.out.println("=====================================");

            personnage.afficheInfos();
            personnage.afficheDeplacement();
            personnage.afficheTache();

            System.out.println("=====================================");
        }

    }
}
