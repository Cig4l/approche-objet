package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne person1 = new Personne("Coralie", "Ruiz");
        AdressePostale address1modified = new AdressePostale("36", "rue Jeanne d'Arc", "13000", "Marseille");
        person1.setAddress(address1modified);

        AdressePostale address2 = new AdressePostale("26", "rue des Dahlias", "66000", "Perpignan");
        Personne person2 = new Personne("Maria", "Madrigal", address2);
    }
}
