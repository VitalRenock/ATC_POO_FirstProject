package Chap8_Ex2;

public class Truck extends MotorVehicle {

    //region Constructors

    public Truck(String model) {
        super(model);
    }

    public Truck(int fuel, String model) {
        super(fuel, model);
    }

    //endregion

    //region Methods

    public int driveVehicle(int consumption) {

        return super.driveVehicle(consumption * 2);
    }

    //endregion

}
