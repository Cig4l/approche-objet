package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne person1 = new Personne("Coralie", "Ruiz");
        person1.address = new AdressePostale("1", "allée des Amis", "34070", "Montpellier");

        AdressePostale address2 = new AdressePostale("26", "rue des Dahlias", "66000", "Perpignan");
        Personne person2 = new Personne("Maria", "Madrigal", address2);
    }
}
