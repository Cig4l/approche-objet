package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

public class FusionMap {
    public static void main(String args[]) {
// Création map1
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");
// Création map2
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");
//  Exercice
        HashMap<Integer, String> map3 = new HashMap<Integer, String>();

        for(Map.Entry<Integer, String> entry : map1.entrySet()){
            map3.put(entry.getKey(), entry.getValue());
        }

        for(Map.Entry<Integer, String> entry : map2.entrySet()){
            map3.put(entry.getKey(), entry.getValue());
        }

        for(Map.Entry<Integer, String> entry : map3.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

