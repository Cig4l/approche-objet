package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale address1 = new AdressePostale();
        address1.streetNumber = "12";
        address1.streetName = "rue de la Paix";
        address1.zipCode = "66000";
        address1.city = "Perpignan";

        AdressePostale address2 = new AdressePostale();
        address2.streetNumber = "8bis";
        address2.streetName = "rue de la Soif";
        address2.zipCode = "34000";
        address2.city = "Montpellier";
    }
}
