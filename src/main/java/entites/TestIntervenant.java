package entites;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salarie = new Salarie("Ruiz", "Coralie",1700.0);
        salarie.afficherDonnées();

        Pigiste pigiste = new Pigiste("Bly", "Nellie", 25, 150.0);
        pigiste.afficherDonnées();
    }
}
