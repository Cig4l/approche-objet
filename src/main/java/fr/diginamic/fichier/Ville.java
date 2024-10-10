package fr.diginamic.fichier;

public class Ville {
    String name;
    String zipCode;
    String region;
    int totalPopulation;

    public Ville(String name, String zipCode, String region, int totalPopulation) {
        this.name = name;
        this.zipCode = zipCode;
        this.region = region;
        this.totalPopulation = totalPopulation;
    }

    public String getName() {
        return name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getRegion() {
        return region;
    }

    public int getTotalPopulation() {
        return totalPopulation;
    }
}
