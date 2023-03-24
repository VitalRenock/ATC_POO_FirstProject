package Revision_Ex5;

public class MotorVehicle extends Vehicle {

    //region Properties

    private String model;

    //endregion

    //region Constructors

    public MotorVehicle(String model) {
        this.model = model;
    }

    public MotorVehicle(int fuel, String model) {
        super(fuel);
        this.model = model;
    }

    //endregion

    //region Getters / Setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //endregion

    //region Methods

    /**
     * Réduit d'une unité le ‘fuel’.
     * Le niveau de 'fuel' ne peut jamais être négatif
     */
    public void startEngine() throws StartEngineException {

        if ((getFuel() - 1) < 0)
            throw new StartEngineException();
        setFuel(getFuel() - 1);
    }

    /**
     * Affiche le message de moteur arrêté.
     */
    public void stopEngine() {
        System.out.println("Moteur arrêté");
    }

    /**
     * Prend en argument la consommation de 'fuel'.
     * Le niveau de 'fuel' ne peut jamais être négatif (indice : Math.min)
     *
     * @param consumption
     */
    public void driveVehicle(int consumption) throws DriveVehiculeException {

        setFuel(getFuel() - (Math.min(getFuel(),consumption)));
        if (getFuel() == 0)
            throw new DriveVehiculeException();
    }

    //endregion

}
