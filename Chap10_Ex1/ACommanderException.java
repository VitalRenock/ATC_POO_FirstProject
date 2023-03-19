package Chap10_Ex1;

public class ACommanderException extends Exception {

    //region Constructors

    public ACommanderException(String message) {
        super(message);
    }

    //endregion

    //region Methods

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    //endregion
}
