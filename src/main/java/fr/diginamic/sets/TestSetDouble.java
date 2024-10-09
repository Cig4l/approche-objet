package fr.diginamic.sets;

import java.util.HashSet;
import java.util.List;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> numbersSet = new HashSet<>();
        numbersSet.addAll(List.of(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

        System.out.println("Eléments de la collection : \n" + numbersSet);

        boolean isFirstNumber = true;
        Double biggerNumber = 0.0;

        for(Double number : numbersSet){
            if(isFirstNumber) {
                isFirstNumber = false;
                biggerNumber = number;
            } else if (number > biggerNumber) {
                biggerNumber = number;
            }
        }
        System.out.println("Plus grand nombre du set : " + biggerNumber);

        isFirstNumber=true;
        Double smallestNumber = 0.0;

        for(Double number : numbersSet){
            if(isFirstNumber) {
                isFirstNumber = false;
                smallestNumber = number;
            } else if (number < smallestNumber) {
                smallestNumber = number;

            }
        }
        System.out.println("Plus petit nombre du set : " + smallestNumber);
        numbersSet.remove(smallestNumber);
        System.out.println("Eléments de la collection après suppression de " + smallestNumber + " : \n" + numbersSet);

    }
}

