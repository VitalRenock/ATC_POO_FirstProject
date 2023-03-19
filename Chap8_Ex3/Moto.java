package Chap8_Ex3;

public class Moto extends MotorVehicle {

//region Constructors

    public Moto(String model) {
        super(model);
    }

    public Moto(String model, int fuel) {
        super(model, fuel);
    }

//endregion

//region Methods

    public int driveVehicle(int consumption) {
        return super.driveVehicle(consumption / 2);
    }


//endregion

}
