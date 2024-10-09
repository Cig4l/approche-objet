package fr.diginamic.sets;

import java.util.HashSet;
import java.util.List;

public class TestPays {
    public static void main(String[] args) {
        HashSet<Pays> hCountries = new HashSet<>(List.of(
                new Pays("USA", 339290000, 25400.0),
                new Pays("France", 68373433, 2370.500),
                new Pays("Allemagne", 84080000, 4121.00),
                new Pays("UK", 66870000, 3071.0),
                new Pays("Italie", 58860000, 2069.0),
                new Pays("Japon", 125120000, 4941.0),
                new Pays("Chine", 1425893465, 16531.76),
                new Pays("Russie", 143560000, 2240.0),
                new Pays("Inde", 1428627663, 3534.743)
        ));

        Pays countryWithBiggestPibPerInhabitant = null;
        Pays countryWithBiggestTotalPib = null;
        Pays countryWithSmallestTotalPib = null;
        double biggestPibPerInhabitant = 0.0;
        double totalPib = 0.0;
        Integer totalInhabitants = 0;

        for(Pays country : hCountries){
            if(country.getPibPerInhabitants() > biggestPibPerInhabitant) {
                biggestPibPerInhabitant = country.getPibPerInhabitants();
                countryWithBiggestPibPerInhabitant = country;
            }
        }
        System.out.println("Pays avec le plus grand PIB/habitant : " + countryWithBiggestPibPerInhabitant.getName());
        hCountries.remove(countryWithBiggestPibPerInhabitant);

        for (Pays country : hCountries){
            if(country.getPibPerInhabitants() * country.getNumberOfInhabitants() > totalPib) {
                totalPib = country.getPibPerInhabitants() * country.getNumberOfInhabitants();
                countryWithBiggestTotalPib = country;
            }
        }
        System.out.println("Pays avec le plus grand PIB total : " + countryWithBiggestTotalPib.getName());

        for(Pays country : hCountries){
            if(country.getPibPerInhabitants() * country.getNumberOfInhabitants() < totalPib){
                totalPib = country.getPibPerInhabitants() * country.getNumberOfInhabitants();
                countryWithSmallestTotalPib = country;
            }
        }
        countryWithSmallestTotalPib.setName(countryWithSmallestTotalPib.getName().toUpperCase());
        System.out.println("Pays avec le plus petit PIB total : " + countryWithSmallestTotalPib.getName());
        hCountries.remove(countryWithSmallestTotalPib);

        System.out.println("\nListe des pays :");
        for(Pays country : hCountries) {
            System.out.println(country.getName());
        }
    }
}
