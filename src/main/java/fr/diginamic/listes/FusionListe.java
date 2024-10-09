package fr.diginamic.listes;

import java.util.ArrayList;

public class FusionListe {
    public static void main(String[] args) {
        ArrayList<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        ArrayList<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        ArrayList<String> liste3 = new ArrayList<String>();
        for(int i=0; i<liste1.size(); i++){
            liste3.add(liste1.get(i));
            liste3.add(liste2.get(i));
        }

        System.out.println("Eléments de la liste : " + liste3);
    }
}
