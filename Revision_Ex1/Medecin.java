package Revision_Ex1;

public class Medecin extends Personnage implements ISoin {

    //region Properties

    private String soin;

    //endregion

    //region Constructors

    /**
     * Sans argument,on hardcode le nom (Anonyme) et la profession
     */
    public Medecin() {
        super("Anonyme");
        this.setProfession("Médecin");
    }

    /**
     * 1 argument (nom), on hardcode la profession, le déplacement et le type de soin
     *
     * @param nom
     */
    public Medecin(String nom) {
        super(nom);
        this.setProfession("Médecin");
        this.setDeplacement("à pied");
        this.setSoin("les premier soins");
    }

    /**
     * 3 arguments (nom, deplacement, soin), on hardcode la profession
     *
     * @param nom
     * @param deplacement
     * @param soin
     */
    public Medecin(String nom, String deplacement, String soin) {
        super(nom);
        this.setProfession("Médecin");
        this.setDeplacement(deplacement);
        this.setSoin(soin);
    }

    //endregion

    //region Getters / Setters

    public String getSoin() {
        return soin;
    }

    public void setSoin(String soin) {
        this.soin = soin;
    }

    //endregion

    //region Methods

    @Override
    public void afficheTache() {
        if (getSoin() != null)
            afficheSoin();
    }

    @Override
    public void afficheSoin() {
        System.out.println("Je pratique " + getSoin());
    }

    //endregion
}
