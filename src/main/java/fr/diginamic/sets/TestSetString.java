package fr.diginamic.sets;

import java.util.HashSet;
import java.util.List;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> hCountries = new HashSet<>();
        hCountries.addAll(List.of("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

        int length = 0;
        String longestCountryName = "";

        for(String country : hCountries) {
            if(country.length() > length){
                length = country.length();
                longestCountryName = country;
            }
        }
        hCountries.remove(longestCountryName);
        System.out.println("Collection après la suppression du pays avec le nom le plus long : \n" + hCountries);


    }
}
