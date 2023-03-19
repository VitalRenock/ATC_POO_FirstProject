package Chap8_Ex3;

public abstract class Vehicle {

//region Properties

private String model = "";

// endregion

//region Constructors

    public Vehicle(String model) {
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

public abstract boolean startEngine();

public abstract void stopEngine();

public abstract int driveVehicle(int consumption);

// Méthode à ajoutée pour pouvoir utiliser "Vehicle" comme type de tableau dans nos tests
public abstract void refillFuel(int fuel);

//endregion
}
