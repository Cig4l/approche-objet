package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne person1 = new Personne();
        person1.firstName = "Coralie";
        person1.lastName = "Ruiz";
        person1.address.city = "Montpellier";
        person1.address.zipCode = "34070":
        person1.address.streetName = "allée des Amis";
        person1.address.streetNumber = "1";

        Personne person2 = new Personne();
        person2.firstName = "Maria";
        person2.lastName = "Madrigal";
        person2.address.city = "Perpignan";
        person2.address.zipCode = "66000";
        person2.address.streetName = "rue des Dahlias";
        person2.address.streetNumber = "26";
    }
}
