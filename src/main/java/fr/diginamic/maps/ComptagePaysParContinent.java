package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> countriesArrayList = new ArrayList<Pays>();
        HashMap<String, Integer> countriesMap = new HashMap<>();

        countriesArrayList.add(new Pays("France", 65000000, "Europe"));
        countriesArrayList.add(new Pays("Allemagne", 80000000, "Europe"));
        countriesArrayList.add(new Pays("Belgique", 10000000, "Europe"));
        countriesArrayList.add(new Pays("Russie",150000000, "Europe"));
        countriesArrayList.add(new Pays("Chine", 1400000000, "Asie"));
        countriesArrayList.add(new Pays("Indonésie", 220000000, "Asie"));
        countriesArrayList.add(new Pays("Australie", 10000000, "Océanie"));

        countriesMap.put("Afrique", 0);
        countriesMap.put("Amérique", 0);
        countriesMap.put("Asie", 0);
        countriesMap.put("Europe", 0);
        countriesMap.put("Océanie", 0);

        for(Pays pays : countriesArrayList){
            if(countriesMap.containsKey(pays.getContinent())){
                countriesMap.put(pays.getContinent(), countriesMap.get(pays.getContinent())+1);
            }
        }

        System.out.println("Compatge du nombre de pays par continent :");
        for(Map.Entry<String, Integer> entry : countriesMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}





