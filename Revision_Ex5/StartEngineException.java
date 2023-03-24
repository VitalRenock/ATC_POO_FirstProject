package Revision_Ex5;

public class StartEngineException extends Exception {

    //region Constructors

    public StartEngineException() {
        super("Le moteur n'a pu démarrer");
    }

    public StartEngineException(String message) {
        super(message);
    }

    //endregion

}
