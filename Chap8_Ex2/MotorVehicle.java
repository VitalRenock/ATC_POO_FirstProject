package Chap8_Ex2;

public class MotorVehicle extends Engine {

    //region Properties

    private String model = "";

    //endregion

    //region Getters / Setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

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

    //region Methods

    /**
     *  Prend en argument la consommation de 'fuel' et
     *  retourne le niveau de 'fuel' après consommation.
     *  Le niveau de 'fuel' ne peut jamais être négatif (indice : Math.min)
     *
     * @param consumption
     * @return nouelle quantité de fuel
     */
    public int driveVehicle(int consumption) {

        consumeFuel(consumption);
//        System.out.println("Nouvau trajet effectué - " + getFuelToString());
        return getFuel();
    }


    /**
     * Affiche le model du véhicule sous forme de titre.
     */
    public void showResume() {

        System.out.println("");
        System.out.println(getModel());
        System.out.println(getFuelToString());
        System.out.println("-----------------------");
    }

    //endregion
}
