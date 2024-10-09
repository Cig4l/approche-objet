package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        String[] array = new String[]{"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"};
        ArrayList<String> stringArray = new ArrayList<String>();
        stringArray.addAll(Arrays.asList(array));

        System.out.println(stringArray);
        int index = -1;
        int length = 0;

        for(int i=0; i<stringArray.size(); i++){
            if(stringArray.get(i).length() > length) {
                length = stringArray.get(i).length();
                index = i;
            }
        }
        System.out.println("Ville avec le nom le plus long : " + stringArray.get(index));

        for(int i=0; i<stringArray.size(); i++) {
            stringArray.set(i, stringArray.get(i).toUpperCase());
        }
        System.out.println("Villes en lettres capitales : " + stringArray);

        for(int i=0; i<stringArray.size(); i++){
            String ville = stringArray.get(i);
            if(ville.charAt(0) == 'N') {
                stringArray.remove(i);
            }
        }
        System.out.println("Villes dont le nom ne commence pas par N : " + stringArray);
    }
}
