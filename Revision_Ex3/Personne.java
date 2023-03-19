package Revision_Ex3;

public class Personne {

    //region Properties

    private String nom, prenom, profession, niss;

    //endregion

    //region Constructor

    public Personne() {}

    //endregion

    //region Getters / Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getNiss() {
        return niss;
    }

    public void setNiss(String niss) {
        this.niss = niss;
    }

    //endregion

    //region Methods

    public void afficheTache() {
        System.out.println("Profession: " + getProfession());
    }

    public void afficheInfos() {
        System.out.println("Nom: " + getNom());
        System.out.println("Prénom: " + getPrenom());
        System.out.println("NISS: " + getNiss());
    }

    //endregion
}
