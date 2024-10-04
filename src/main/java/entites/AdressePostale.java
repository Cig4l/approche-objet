package entites;

public class AdressePostale {
    String streetNumber;
    String streetName;
    String zipCode;
    String city;

    AdressePostale(String streetNumber, String streetName, String zipCode, String city){
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.city = city;
    }
}
