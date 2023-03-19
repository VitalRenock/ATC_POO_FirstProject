package Chap9_Ex2;

public class Test_Enum {

    public static void main(String[] args) {

        // Traitements (parcours de EnumMonths)
        int pagination = 0;
        for (int i = 0; i < 4; i++) {

            System.out.println("-----------------------");
            System.out.println(EnumSeasons.values()[i].getText().toUpperCase());
            System.out.println("-----------------------");
            //System.out.println("i = " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println(EnumMonths.values()[j + pagination].getText());
                //System.out.println("j = " + (j + pagination));
            }
            pagination += 3;
        }
    }

}
