package fr.diginamic.salaire;

public class Salarie extends Intervenant {
    private double salaire;
    private String statut = "salarié";

    public Salarie(String nom, String prenom, double salaire){
        super(nom, prenom);
        this.salaire = salaire;
    }

    @Override
    public double getSalaire() {
        return salaire;
    }

    @Override
    public String getStatut() {
        return statut;
    }

    @Override
    public void afficherDonnées() {
        System.out.println("Nom : " + this.getNom());
        System.out.println("Prénom : " + this.getPrenom());
        System.out.println("Salaire : " + this.getSalaire());
        System.out.println("Statut : " + this.getStatut() + "\n");
    }
}
