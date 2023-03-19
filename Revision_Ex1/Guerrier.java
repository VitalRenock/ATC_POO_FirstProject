package Revision_Ex1;

public class Guerrier extends Personnage implements IArme {

    //region Properties

    private String arme;

    //endregion

    //region Constructors

    /**
     * Sans argument,on hardcode le nom (Anonyme) et la profession
     */
    public Guerrier() {
        super("Anonyme");
        this.setProfession("Guerrier");
    }

    /**
     * 1 argument (nom), on hardcode la profession, le déplacement et le type d'arme
     *
     * @param nom
     */
    public Guerrier(String nom) {
        super(nom);
        this.setProfession("Guerrier");
        this.setDeplacement("à pied");
        this.setArme("un couteau");
    }

    /**
     * 3 arguments (nom, deplacement, arme), on hardcode la profession
     *
     * @param nom
     * @param deplacement
     * @param arme
     */
    public Guerrier(String nom, String deplacement, String arme) {
        super(nom);
        this.setProfession("Guerrier");
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
        System.out.println("Je me bats avec " + getArme());
    }

    //endregion
}
