package Revision_Ex5;

import java.lang.reflect.Type;

public class Test_Vehicles {

    public static void main(String[] args) {

        // Garnir un tableau avec 3 'Moto', 3 'Car' et 3 'Truck'.
        MotorVehicle[] motorVehicles = {
                new Moto(40, "Harley"),
                new Moto(10, "Suzuki"),
                new Moto(80, "Honda"),
                new Car(60, "CRX"),
                new Car(30, "Corvette"),
                new Car(0, "Camaro"),
                new Truck(100, "MAN"),
                new Truck(20, "Volvo"),
                new Truck(80, "Mercedes"),
        };

        // Pour chaque élément du tableau,
        for (MotorVehicle motorVehicle : motorVehicles) {

            System.out.println("--------------------------------------------------");

            System.out.println("Véhicule: " + motorVehicle.getClass().getSimpleName());
            System.out.println("Model: " + motorVehicle.getModel());
            System.out.println("Fuel:" + motorVehicle.getFuel()+ "l\n");

            // Faire démarrer le moteur
            try {
                motorVehicle.startEngine();
                System.out.println("Moteur démarré - Fuel: " + motorVehicle.getFuel() + "l");
            }
            catch (StartEngineException exception) {
                System.out.println(exception.getMessage());
                // Faire le plein quand c'est nécessaire (20 litres au démarrage)
                motorVehicle.refillFuel(20);
                System.out.println("Plein effectué - Fuel: " + motorVehicle.getFuel() + "l");
            }

            // Effectuer 5 trajets
            // (consommation de base : 10 litres / trajet)
            for (int i = 0; i < 5; i++) {
                try {
                    motorVehicle.driveVehicle(10);
                    System.out.println("Trajet " + (i+ 1) + " effectué - Fuel: " + motorVehicle.getFuel() + "l");
                }
                catch (DriveVehiculeException exception) {
                    // Si un trajet n'est pas terminé (affichage du message 'panne de carburant’)
                    System.out.println("Trajet " + (i+ 1) + " effectué - " + exception.getMessage());
                    // Faire le plein quand c'est nécessaire (50 litres pendant les trajets)
                    motorVehicle.refillFuel(50);
                    System.out.println("Plein effectué - Fuel: " + motorVehicle.getFuel() + "l");
                }
            }

            // Arrêter le moteur
            motorVehicle.stopEngine();

            System.out.println("--------------------------------------------------");

        }
    }
}
