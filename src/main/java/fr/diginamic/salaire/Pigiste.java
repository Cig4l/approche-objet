package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
    int workedDaysThisMonth;
    double dailySalary;
    String statut = "pigiste";

    public Pigiste(String nom, String prenom, int workedDaysThisMonth, double dailySalary) {
        super(nom, prenom);
        this.workedDaysThisMonth = workedDaysThisMonth;
        this.dailySalary = dailySalary;
    }

    @Override
    public double getSalaire() {
        return dailySalary;
    }

    @Override
    public String getStatut() {
        return statut;
    }
}
