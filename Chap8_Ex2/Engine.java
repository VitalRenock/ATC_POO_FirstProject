package Chap8_Ex2;

public class Engine {

    //region Properties
    private int fuel = 0;
    //endregion

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

    public Engine() {}

    public Engine(int fuel) {
        setFuel(fuel);
    }

    //endregion

    //region Methods

    /**
     * Réduit d'une unité le carburant et renvoi un booléen
     * indiquant si l'opération est possible ou non.
     *
     * @return isSucess
     */
    public boolean startEngine() {

        boolean isSuccess = false;
        if (getFuel() >= 1) {
            consumeFuel(1);
            isSuccess = true;
            System.out.println("Moteur démarré.");
        }

        return isSuccess;
    }


    /**
     * Affiche le message "Moteur stoppé".
     */
    public void stopEngine() {
        System.out.println("Moteur stoppé.");
    }


    /**
     * Prend en argument la quantité de 'fuel' à ajouter.
     *
     * @param fuelToRefill
     */
    public void refillFuel(int fuelToRefill) {
        setFuel(getFuel() + fuelToRefill);
        System.out.println("Plein effectué (" + fuelToRefill + "l) - " + getFuelToString() + ".");
    }


    /**
     * Prend en argument la quantité de 'fuel' à consommer.
     *
     * @param fuelToConsume
     */
    public void consumeFuel(int fuelToConsume) {

        int fuelConsumed = Math.min(getFuel(), fuelToConsume);
        setFuel(getFuel() - fuelConsumed);
        System.out.println("Moteur consomme " + fuelConsumed + "l - " + getFuelToString() + ".");

        if (getFuel() == 0) {
            System.out.println("Panne d'essence.");
        }
    }

    /**
     * Retourne la quantité d'essence sous format String
     *
     * @return fuel
     */
    public String getFuelToString() {
        return "Essence: " + getFuel() + "l";
    }

    //endregion
}
