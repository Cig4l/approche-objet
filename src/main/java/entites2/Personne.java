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
}
