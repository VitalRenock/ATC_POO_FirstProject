package Chap8_Ex3;

public class Truck extends MotorVehicle {

//region Constructors

    public Truck(String model) {
        super(model);
    }

    public Truck(String model, int fuel) {
        super(model, fuel);
    }

//endregion

//region Methods

    public int driveVehicle(int consumption) {
        return super.driveVehicle(consumption * 2);
    }

//endregion

}
