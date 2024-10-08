package fr.diginamic.operations;

import java.util.ArrayList;

public class CalculMoyenne {
    private Double[] array;
    private ArrayList<Double> arrayList = new ArrayList<>();

    public CalculMoyenne(Double[] array) {
        for(double number : array) {
            arrayList.add(number);
        }
        this.arrayList = arrayList;
    }

    public void printArrayList() {
        System.out.println("\nNotes de la classe :");
        for(double number : this.arrayList) {
            System.out.println(number);
        }
    }

    public void ajout(Double number) {
        this.arrayList.add(number);
    }

    public String calcul() {
        double res = 0;
        int counter = 0;

        for(Double i : this.arrayList) {
            res+=i;
            counter++;
        }

        return "\nMoyenne de la classe : " + res/counter;
    }
}
