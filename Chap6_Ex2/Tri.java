package Chap6_Ex2;

public class Tri {

    public int getMax(int nb1, int nb2) {
        return Math.max(nb1, nb2);
    }

    public int getMax(int nb1, int nb2, int nb3) {
        return nb3 > getMax(nb1, nb2) ? nb3 : getMax(nb1, nb2);
    }

    public int getMax(int nb1, int nb2, int nb3, int nb4) {
        return nb4 > getMax(nb1, nb2, nb3) ? nb4 : getMax(nb1, nb2, nb3);
    }

    public int getMax(int nb1, int nb2, int nb3, int nb4, int nb5) {
        return nb5 > getMax(nb1, nb2, nb3, nb4) ? nb5 : getMax(nb1, nb2, nb3, nb4);
    }

}
