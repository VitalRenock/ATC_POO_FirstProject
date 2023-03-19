package Chap8_Ex3;

public class MotorVehicle extends Vehicle implements IEngine {

// region Properties

    private int fuel = 0;

// endregion

//region Getters / Setters

    // FUEL
    public int getFuel() {
        return fuel;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

//endregion

//region Constructors

    public  MotorVehicle(String model) {
        super(model);
    }

    public MotorVehicle(String model, int fuel) {
        super(model);
        setFuel(fuel);
    }

//endregion

//region Methods

    /**
     * Réduit d'une unité le carburant et renvoi un booléen
     * indiquant si l'opération est possible ou non.
     *
     * @return success
     */
    @Override
    public boolean startEngine() {

        boolean success = consumeFuel(1);
        if (success) {
            System.out.println("Moteur démarré.");
            displayFuel();
        }

        return success;
    }

    /**
     * Affiche le message "Moteur stoppé"
     */
    @Override
    public void stopEngine() {

        System.out.println("Moteur stoppé.");
        displayFuel();
    }


    /**
     * Prend en argument la consommation de 'fuel'
     * et retourne le niveau de 'fuel' après consommation.
     * Le niveau de 'fuel' ne peut jamais être négatif (indice : Math.min)
     *
     * @return niveau de carburant
     */
    public int driveVehicle(int consumption) {

        consumeFuel(Math.min(getFuel(), consumption));
        System.out.println("Trajet effectué.");
        displayFuel();
        return getFuel();
    }

    /**
     * Consomme si possible la quantité de fuel donné
     *
     * @param consumption quantité de fuel
     * @return success
     */
    public boolean consumeFuel(int consumption) {

        boolean success = false;
        if ((getFuel() - consumption) >= 0) {
            setFuel(getFuel() - consumption);
            success = true;
            System.out.println("Consommation de " + consumption);
//            displayFuel();
        }

        return success;
    }

    public void displayFuel() {
        System.out.println("     - Essence : " + getFuel() + "l");
    }

    public void refillFuel(int fuel) {
        setFuel(getFuel() + fuel);
        System.out.println("Plein effectué.");
        displayFuel();
    }

    //endregion

}
