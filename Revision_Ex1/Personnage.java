package Revision_Ex1;

public abstract class Personnage {

    //region Properties

    private String nom, profession, deplacement;

    //endregion

    //region Constructors

    public Personnage(String nom) {
        this.nom = nom;
    }

    //endregion

    //region Getters / Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDeplacement() {
        return deplacement;
    }

    public void setDeplacement(String deplacement) {
        this.deplacement = deplacement;
    }

    //endregion

    //region Methods

    /**
     * La redéfinition de cette méthode ne comportera
     * pas de System.out.print -> voir interfaces Arme et Soin
     */
    public abstract void afficheTache();

    /**
     * Affiche le nom et la profession du personnage
     */
    public void afficheInfos() {

        if (getNom() != null)
            System.out.println("Je m'appelle " + getNom());

        if (getProfession() != null)
            System.out.println("Je suis un " + getProfession());
    };

    /**
     * Affiche le type de déplacement
     */
    public void afficheDeplacement() {

        if (getDeplacement() != null)
            System.out.println("Je me déplace " + getDeplacement());
    };

    //endregion
}
