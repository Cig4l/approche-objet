package fr.diginamic.maps;

import fr.diginamic.listes.Ville;

import java.util.HashMap;
import java.util.Map;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> hashmap = new HashMap<>();

        Ville[] villes = new Ville[]{
                new Ville("Nice",343000),
                new Ville("Carcassonne",47800),
                new Ville("Narbonne",53400),
                new Ville("Lyon",484000),
                new Ville("Foix",9700),
                new Ville("Pau", 77200),
                new Ville("Marseille",850700),
                new Ville("Tarbes",40600)
        };

        for(Ville ville : villes){
            hashmap.put(ville.getName(), ville);
        }

        Ville lessCrowdedCity = villes[0];

        for(Map.Entry<String, Ville> entry : hashmap.entrySet()){
            Ville ville = entry.getValue();
            if(ville.getPopulation() < lessCrowdedCity.getPopulation()){
                lessCrowdedCity = (Ville) ville;
            }
        }
        hashmap.remove(lessCrowdedCity.getName());

        System.out.println("\nLa ville la moins peuplée était : " + lessCrowdedCity.getName() + " - Population : " + lessCrowdedCity.getPopulation());
        System.out.println("HashMap après suppression :");
        for (Map.Entry<String, Ville> entry : hashmap.entrySet()) {
            System.out.println(entry.getValue().getName() + " - Population : " + entry.getValue().getPopulation());
        }
    }
}
