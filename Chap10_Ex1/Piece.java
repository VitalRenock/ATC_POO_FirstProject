package Chap10_Ex1;

public class Piece {

    //region Properties

    int quantiteEnStock, pointDeCommande;
    String libelle;

    //endregion

    //region Constructors

    public Piece(int quantiteEnStock, int pointDeCommande, String libelle) {

        this.quantiteEnStock = quantiteEnStock;
        this.pointDeCommande = pointDeCommande;
        this.libelle = libelle;
    }

    //endregion

    //region Getters / Setters

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    public int getPointDeCommande() {
        return pointDeCommande;
    }

    public void setPointDeCommande(int pointDeCommande) {
        this.pointDeCommande = pointDeCommande;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    //endregion

    //region Methods

    public void diminuerQuantiteEnStock(int quantite) throws ACommanderException {

        if ((this.quantiteEnStock - quantite) <= this.pointDeCommande) throw new ACommanderException("Le Stock dépasse le Point de commande");
        this.quantiteEnStock -= quantite;
    }

    //endregion

}
