package Revision_Ex1;

public class Sniper extends Personnage implements IArme {

    //region Properties

    private String arme;

    //endregion

    //region Constructors

    /**
     * Sans argument,on hardcode le nom (Anonyme) et la profession
     */
    public Sniper() {
        super("Anonyme");
        this.setProfession("Sniper");
    }

    /**
     * 1 argument (nom), on hardcode la profession, le déplacement et le type d'arme
     *
     * @param nom
     */
    public Sniper(String nom) {
        super(nom);
        this.setProfession("Sniper");
        this.setDeplacement("à pied");
        this.setArme("un fusil de chasse");
    }

    /**
     * 3 arguments (nom, deplacement, arme), on hardcode la profession
     *
     * @param nom
     * @param deplacement
     * @param arme
     */
    public Sniper(String nom, String deplacement, String arme) {
        super(nom);
        this.setProfession("Sniper");
        this.setDeplacement(deplacement);
        this.setArme(arme);
    }

    //endregion

    //region Getters / Setters

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    //endregion

    //region Methods

    @Override
    public void afficheTache() {

        if (getArme() != null)
            afficheArme();
    }

    @Override
    public void afficheArme() {

        System.out.println("Je tire avec " + getArme());
    }

    //endregion
}
