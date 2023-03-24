package Revision_Ex5;

public class DriveVehiculeException extends Exception {

    //region Constructors

    public DriveVehiculeException() {
        super("Panne de carburant");
    }

    public DriveVehiculeException(String message) {
        super(message);
    }

    //endregion

}
