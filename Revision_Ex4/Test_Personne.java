package Revision_Ex4;

public class Test_Personne {

    public static void main(String[] args) {

        Logement[] logements = {
            new Gite(
                    "10",
                    "2",
                    new Localisation("France", "Marseille", 80),
                    5
            ),
            new Gite(
                    "20",
                    "3",
                    new Localisation("Hollande", "Maastricht", 82),
                    10
            ),
            new Gite(
                    "30",
                    "4",
                    new Localisation("Belgique", "Bruxelles", 84),
                    15
            ),
            new ChambreHotel(
                    "90",
                    "4",
                    new Localisation("Italie", "Florence", 86),
                    20,
                    30
            ),
            new ChambreHotel(
                    "115",
                    "5",
                    new Localisation("Espagne", "Barcelone", 89),
                    25,
                    35
            )
        };

        Reservation[] reservations = {
                new Reservation(
                        "Dupont",
                        logements[0],
                        1),
                new Reservation(
                        "Dubois",
                        logements[1],
                        5),
                new Reservation(
                        "Dumont",
                        logements[2],
                        8),
                new Reservation(
                        "Sicorello",
                        logements[3],
                        6),
                new Reservation(
                        "Delsart",
                        logements[4],
                        9),
        };


        // Affichage
        // for ( Reservation reservation : reservations)
        //      System.out.println(reservation.toString());

        for ( Reservation reservation : reservations) {
            try {
                System.out.println(reservation.toString());
                reservation.controler();
                System.out.println("\nRéservation OK");
            }
            catch (DureeException exception) {
                System.out.println("\nRéservation refusé" + exception.getMessage());
            }
        }



    }

}
