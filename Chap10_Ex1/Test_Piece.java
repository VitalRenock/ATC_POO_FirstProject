package Chap10_Ex1;

public class Test_Piece {

    public static void main(String[] args) {

        // Créer un tableau de 5 'Piece'.
        Piece[] pieces = new Piece[5];
        pieces[0] = new Piece(50, 10, "Plaque de fer");
        pieces[1] = new Piece(120, 10, "Tiges de fer");
        pieces[2] = new Piece(25, 10, "Vis");
        pieces[3] = new Piece(80, 10, "Fil de cuivre");
        pieces[4] = new Piece(15, 10, "Tôle de cuivre");

        /**
         * Pour chaque élément du tableau, essayer de diminuer le stock de 45 unités.
         * Si l'on reste au-dessus du point de commande,la diminution est effectuée,
         * sinon, on lance l'exception « ACommanderException ».
         * En cas de succès,on affiche : libellé de la pièce + OK + quantité après diminution.
         * En cas d'échec, on affiche : libellé de la pièce + message d'exception.
         */
        for (int i = 0; i < pieces.length; i++) {

            try {
                pieces[i].diminuerQuantiteEnStock(40);
                System.out.println("OK - Solde du Stock: " + pieces[i].getQuantiteEnStock());
            }
            catch(ACommanderException exception) {
                System.out.println(exception.getMessage());
            }

        }
    }

}
