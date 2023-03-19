package Revision_Ex3;

import Chap9_Ex1.StringUtil;

public class Test_Personne {

    public static void main(String[] args) {

        String tempValidation;

        //region Création tableau Personne

        Personne[] personnes = {
                new Directeur(),
                new Secretaire(),
                new Etudiant()
        };

        //endregion

        //region Enregistrement des informations Personnes

        for (Personne personne : personnes) {

            System.out.println("------------------------------------------");

            // PROFESSION
            System.out.println("Entrez les informations pour " + personne.getProfession());

            // NOM
            System.out.println("Entrez le Nom: ");
            personne.setNom(Clavier.lireString());

            // PRENOM
            System.out.println("Entrez le Prénom: ");
            personne.setPrenom(Clavier.lireString());

            // NISS
            do {
                System.out.println("Entrez le NISS (000000-000.00) : ");
                tempValidation = Clavier.lireString();
            }
            while (!Validation.validateNiss(tempValidation));
            personne.setNiss(tempValidation);

            // SECRETAIRE
            if (personne instanceof Secretaire) {

                // MATRICULE
                do {
                    System.out.println("Entrez le Matricule: ");
                    tempValidation = Clavier.lireString();
                }
                while (!Validation.validateMatricule(tempValidation));
                ((Secretaire) personne).setMatricule(tempValidation);

                // HORAIRE
                System.out.println("Horaire: ");
                ((Secretaire) personne).setHoraire(Clavier.lireString());
            }
            // DIRECTEUR
            else if (personne instanceof Directeur) {

                // MATRICULE
                do {
                    System.out.println("Entrez le Matricule: ");
                    tempValidation = Clavier.lireString();
                }
                while (!Validation.validateMatricule(tempValidation));
                ((Directeur) personne).setMatricule(tempValidation);
            }
            // ETUDIANT
            else if (personne instanceof Etudiant) {

                // COURS
                System.out.print("Cours (");
                for (Cours cours : Cours.values()) {
                    System.out.print(cours);
                    if (cours.ordinal() < Cours.values().length - 1)
                        System.out.print(" / ");
                }
                System.out.println(")");
                ((Etudiant) personne).setCours(Cours.valueOf(Clavier.lireString()));

                // ANNEE
                System.out.println("Année: ");
                ((Etudiant) personne).setAnnee(Clavier.lireInt());
            }

            System.out.println("------------------------------------------");
        }

        //endregion

        //region Lister Personne

        System.out.println("Liste de l'école");

        for (Personne personne : personnes) {

            personne.afficheInfos();
            personne.afficheTache();
        }

        //endregion

/*        for (int i = 0; i < personnes.length; i++) {

            System.out.println("Entrez les informations pour " + personnes[i].getProfession());

            System.out.println("Entrez le Nom: ");
            personnes[i].setNom(Clavier.lireString());

            System.out.println("Entrez le Prenom: ");
            personnes[i].setPrenom(Clavier.lireString());

            do {
                System.out.println("Entrez le NISS: ");
                tempValidation = Clavier.lireString();
            } while (!Validation.validateNiss(tempValidation));
            personnes[i].setNiss(Clavier.lireString());


            if (personnes[i] instanceof Secretaire) {

                Secretaire secretaire = (Secretaire) personnes[i];
                do {
                    System.out.println("Entrez le Matricule: ");
                    tempValidation = Clavier.lireString();
                } while (!Validation.validateMatricule(tempValidation));
                secretaire.setMatricule(tempValidation);
                personnes[i] = secretaire;

            }
            else if (personnes[i] instanceof Directeur) {

                Directeur directeur = (Directeur) personnes[i];
                do {
                    System.out.println("Entrez le Matricule: ");
                    tempValidation = Clavier.lireString();
                } while (!Validation.validateMatricule(tempValidation));
                directeur.setMatricule(tempValidation);
                personnes[i] = directeur;


            }
            else if (personnes[i] instanceof Etudiant) {

                Etudiant etudiant = (Etudiant) personnes[i];

                // COURS
                for (Cours c : Cours.values()) {
                    System.out.println("Entrez le cours: ");
                    ((Etudiant) personnes[i]).setCours(Cours.valueOf((TransformEnum.TransformEnum(Clavier.lireString()))));
                }


                boolean checkInput = false;
                int value = 0;
                do {
                    System.out.println("Entrez l'année: ");
                    try {
                        value = Integer.parseInt(Clavier.lireString());
                        checkInput = true;
                    }
                    catch (Exception exception) {
                        System.out.println("Impossible de convertir la durée en entier!");
                    }
                }
                while (!checkInput);
                etudiant.setAnnee(value);
            }

        }*/

    }
}
