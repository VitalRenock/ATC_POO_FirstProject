package Chap8_Ex2;

public class Test_AllVehicles {
    public static void main(String[] args) {

        int consumption = 10;
        int travelNumber = 5;
        int refillQuantity = 50;

        // Garnir un tableau avec 3 'Car' et 3 'Truck'.
        MotorVehicle[] allVehicules = {
                new Car(30, "Renault Clio"),
                new Car(70, "Honda Civic"),
                new Car(0, "Audi Q8"),
                new Truck(100, "Man TGX"),
                new Truck(0, "Ford F-Max"),
                new Truck(280, "Scania BEV")
        };

        // Pour chaque élément du tableau :
        for (int i = 0; i < allVehicules.length; i++) {

            MotorVehicle currentVehicule = allVehicules[i];

            // Affichage du Model
            currentVehicule.showResume();

            // Faire démarrer le moteur
            if (!currentVehicule.startEngine()) {
                currentVehicule.refillFuel(refillQuantity);
                currentVehicule.startEngine();
            }
            // Effectuer 5 trajets
            for (int j = 1; j <= travelNumber; j++) {

                currentVehicule.driveVehicle(consumption);

                // Faire le plein si panne d'essence
                if (currentVehicule.getFuel() == 0 && j < travelNumber)
                    currentVehicule.refillFuel(refillQuantity);
            }

            // Arrêter le moteur
            currentVehicule.stopEngine();
        }
    }
}
