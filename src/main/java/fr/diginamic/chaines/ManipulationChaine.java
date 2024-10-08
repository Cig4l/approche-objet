package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        char premierCaractere = chaine.charAt(0);
        int indexPointVirgule = chaine.indexOf(';');
        String[] tableau = chaine.split(";");

        String[] parts = chaine.split(";");
        String nom = parts[0];    // "Durand"
        String prenom = parts[1]; // "Marcel"
        String chaineSalaire = parts[2].replace(" ","");
        double salaire = Double.parseDouble(chaineSalaire);

        System.out.println("Premier caractère: " + premierCaractere);
        System.out.println("Nombre de lettres : " + chaine.length());
        System.out.println("Index du point-virgule : " + indexPointVirgule);
        System.out.println("Nom de famille : " + nom);
        System.out.println("NOM DE FAMILLE " + nom.toUpperCase());
        System.out.println("nom de famille : " + nom.toLowerCase());

        Salarie salarie = new Salarie(prenom, nom, salaire);
        System.out.println("\nNom : " + salarie.getLastName());
        System.out.println("Prénom : " + salarie.getFirstName());
        System.out.println("Salaire : " + salarie.getSalary());
    }
}
