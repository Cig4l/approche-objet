package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{-1, 5, 7, 3, -2, 4, 8, 5};
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(-1, 5, 7, 3, -2, 4, 8, 5));

        System.out.println("Eléments de la liste : " + arrayList);
        System.out.println("Taille de la liste : " + arrayList.size());
        System.out.println("Plus grand élément de la liste : " + Collections.max(arrayList));
        System.out.println("Plus petit élément de la liste : " + Collections.min(arrayList));
        System.out.println(Collections.min(arrayList) + " a été supprimé.");
        arrayList.remove(Collections.min(arrayList));
        System.out.println("Maintenant, le plus petit élément de la liste est " + Collections.min(arrayList));

        for(int i=0; i<arrayList.size(); i++){
            if(arrayList.get(i) < 0) {
                arrayList.set(i, arrayList.get(i) * -1);
            }
        }

        System.out.println("Liste sans nombres négatifs : " + arrayList);
    }
}
