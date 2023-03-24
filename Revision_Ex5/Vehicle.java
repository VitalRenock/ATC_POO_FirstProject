package Revision_Ex5;

public abstract class Vehicle {

    //region Properties

    private int fuel;

    //endregion

    //region Constructors

    public Vehicle() {}

    public Vehicle(int fuel) {
        this.fuel = fuel;
    }

    //endregion

    //region Getters / Setters

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    //endregion

    //region Methods

    public void refillFuel(int fuelToAdd) {
        //if (fuelToAdd > 0)
            setFuel(getFuel() + fuelToAdd);
    }

    //endregion

}
