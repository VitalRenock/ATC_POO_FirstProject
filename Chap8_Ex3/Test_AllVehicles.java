package Chap8_Ex3;

public class Test_AllVehicles {

    public static void main(String[] args) {

        int totalTravel = 3;

        // Garnir un tableau avec 2 'Moto', 2 'Car' et 2 'Truck'.
        Vehicle[] vehicles = new MotorVehicle[] {
                new Moto("HONDA", 20),
                new Moto("SUZUKI", 0),
                new Car("CRX", 20),
                new Car("CORVETTE", 0),
                new Truck("VOLVO", 20),
                new Truck("MAN", 0),
        };

        // Pour chaque élément du tableau
        for (int i = 0; i < vehicles.length; i++) {

            Vehicle vehicle = vehicles[i];

            System.out.println("-----------------------------------");
            System.out.println(vehicle.getModel());

            // Faire démarrer le moteur
            if (!vehicle.startEngine()) {
                vehicle.refillFuel(20);
                vehicle.startEngine();
            }

            // Effectuer 3 trajets (consommation de base : 10 litres / trajet)
            for (int j = 0; j < totalTravel; j++)
                if (vehicle.driveVehicle(10) == 0) {
                    vehicle.refillFuel(50);
                }

            // Arrêter le moteur.
            vehicle.stopEngine();

            System.out.println("-----------------------------------");
        }

        //
        // Faire le plein quand c'est nécessaire (20 litres au démarrage, 50 litres pendant les trajets).
        // Si un trajet n'est pas terminé (affichage du message 'panne d'essence'),
// on passe au trajet suivant après avoir fait le plein.


    }
}
