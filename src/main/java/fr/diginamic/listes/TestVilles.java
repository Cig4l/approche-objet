package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestVilles {
    public static void main(String[] args) {

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

        ArrayList<Ville> arrayVilles = new ArrayList<>(List.of(villes));
//        System.out.println(arrayVilles);

        int population = 0;
        int index = -1;

        for(int i=0; i<arrayVilles.size(); i++){
            if(arrayVilles.get(i).getPopulation() > population){
                population = arrayVilles.get(i).getPopulation();
                index = i;
            }
        }
        System.out.println("Ville la plus peuplée : " + arrayVilles.get(index).getName());
        population = arrayVilles.get(index).getPopulation();
        index = -1;

        for(int i=0; i<arrayVilles.size(); i++){
            if(arrayVilles.get(i).getPopulation() < population){
                population = arrayVilles.get(i).getPopulation();
                index = i;
            }
        }
        System.out.println("Ville la moins peuplée : " + arrayVilles.get(index).getName());
        arrayVilles.remove(index);

        for(int i=0; i<arrayVilles.size(); i++){
            if(arrayVilles.get(i).getPopulation() > 100000) {
                arrayVilles.get(i).setName(arrayVilles.get(i).getName().toUpperCase());
            }
        }

        System.out.println("\n");
        for(int i=0; i<arrayVilles.size(); i++){
            System.out.println(arrayVilles.get(i).getName() + " : " + arrayVilles.get(i).getPopulation() + " habitants");
        }

        Ville compare1 = new Ville("Collioure", 300);
        Ville compare2 = new Ville("Collioure", 300);
        Ville compare3 = new Ville("Sète", 2000);

        System.out.println("\nCollioure et Collioure avec compare() : " + compare1.equals(compare2));
        System.out.println("Collioure et Sète et Nice avec compare() : " + compare1.equals(compare3));
        System.out.println("Collioure et Collioure avec == : " + (compare1 == compare2));
        System.out.println("Collioure et Collioure avec == : " + (compare1 == compare3));
        compare1 = compare2;
        System.out.println("Collioure et Collioure avec réassignation : " + (compare1 == compare2));
    }
}
