package fr.diginamic.salaire;

public abstract class Intervenant {
    private String nom;
    private String prenom;
    private String statut;

    Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void afficherDonnées(){
        System.out.println("Nom : " + this.nom);
        System.out.println("Prénom : " + this.prenom);
        System.out.println("Salaire : " + this.getSalaire());
        System.out.println("Statut : " + this.getStatut());
    }

    public abstract double getSalaire();

    public abstract String getStatut();

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
