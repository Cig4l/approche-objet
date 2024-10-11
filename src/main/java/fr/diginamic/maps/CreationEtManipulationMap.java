package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

public class CreationEtManipulationMap {
    public static void main(String args[]) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        // Exercice
        mapVilles.put(59, "Lille");
        mapVilles.put(33, "Bordeaux");
        mapVilles.put(69, "Lyon");

        for(Map.Entry<Integer, String> entry : mapVilles.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nTaille de la map : " + mapVilles.size());
    }
}

