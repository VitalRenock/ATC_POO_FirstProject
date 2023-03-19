package Chap8_Ex1;

public class Personne {

    //region Attributs
    private String nom;
    private String prenom;
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
    //endregion

    //region Constructeurs
    public Personne(String nom, String prenom) {
        setNom(nom);
        setPrenom(prenom);
    }
    //endregion

    //region Méthodes
    public void affiche()
    {
        System.out.println("Nom: " + nom + " - Prénom: " + prenom);
    }

    public void changeInfos(String nom, String prenom)
    {
        setNom(nom);
        setPrenom(prenom);
    }
    //endregion
}
