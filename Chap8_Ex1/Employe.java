package Chap8_Ex1;

public class Employe extends Personne
{
    //region Attributs
    private int matricule;
    //endregion

    //region Getters / Setters
    public int getMatricule() {
        return matricule;
    }
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }
    //endregion

    //region Constructeurs
    public Employe(String nom, String prenom, int matricule) {
        super(nom, prenom);
        setMatricule(matricule);
    }
    //endregion

    //region Méthodes
    public void affiche()
    {
        super.affiche();
        System.out.println("Matricule: " + getMatricule());
    }

    public void changeMatricule(int matricule)
    {
        setMatricule(matricule);
    }
    //endregion
}
