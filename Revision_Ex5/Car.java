package Revision_Ex5;

public class Car extends MotorVehicle {

    //region Constructors

    public Car(String model) {
        super(model);
    }

    public Car(int fuel, String model) {
        super(fuel, model);
    }

    //endregion

    //region Methods

    @Override
    public void driveVehicle(int consumption) throws DriveVehiculeException {
        super.driveVehicle(consumption * 2);
    }

    //endregion

}
