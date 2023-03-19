package Revision_Ex3;

import Chap9_Ex1.StringUtil;

public class Test_Personne {

    public static void main(String[] args) {

        String tempValidation;

        Personne[] personnes = {
                new Directeur(),
                new Secretaire(),
                new Etudiant()
        };

        for (int i = 0; i < personnes.length; i++) {

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

            } else if (personnes[i] instanceof Directeur) {

                Directeur directeur = (Directeur) personnes[i];
                do {
                    System.out.println("Entrez le Matricule: ");
                    tempValidation = Clavier.lireString();
                } while (!Validation.validateMatricule(tempValidation));
                directeur.setMatricule(tempValidation);
                personnes[i] = directeur;


            } else if (personnes[i] instanceof Etudiant) {

                Etudiant etudiant = (Etudiant) personnes[i];

                // COURS
                for (Cours c : Cours.values()) {
                    System.out.println("Entrez le cours: ");
                    ((Etudiant) personnes[i]).setCours(Cours.valueOf((TransformEnum.TransformEnum(Clavier.lireString()))));
                }


                System.out.println("Entrez l'année: ");
                etudiant.setAnnee(Clavier.lireString());
            }

        }

    }
}
