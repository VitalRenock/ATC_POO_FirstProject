package Revision_Ex3;

public class Employe extends Personne {

    //region Properties

    private String matricule;

    //endregion

    //region Getters / Setters

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    //endregion

    //region Methods

    @Override
    public void afficheInfos() {
        super.afficheInfos();
        System.out.println("Matricule: " + getMatricule());
    }


    //endregion
}
