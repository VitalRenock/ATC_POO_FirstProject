package Revision_Ex5;

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

    @Override
    public void driveVehicle(int consumption) throws DriveVehiculeException {
        super.driveVehicle(consumption * 4);
    }

    //endregion

}
