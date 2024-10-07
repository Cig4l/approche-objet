package entites2;

import entites.AdressePostale;

public class Personne {
    public String firstName;
    public String lastName;
    public AdressePostale address;

    public Personne(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Personne(String firstName, String lastName, AdressePostale address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public void printName() {
        System.out.println(this.firstName + " " + this.lastName.toUpperCase());
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAddress(AdressePostale address) {
        this.address = address;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public AdressePostale getAddress() {
        return this.address;
    }
}
