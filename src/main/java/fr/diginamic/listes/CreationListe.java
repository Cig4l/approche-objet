package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList array = new ArrayList<Integer>();

        for(int i=0; i<100; i++) {
            array.add(i+1);
        }

        System.out.println(array.size());
    }
}
