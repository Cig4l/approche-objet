package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMoyenne {
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<>(Arrays.asList(12.5, 15.0, 10.0, 8.0, 20.0));
        CalculMoyenne calcul = new CalculMoyenne(array);

        calcul.ajout(5.0);
        calcul.printArrayList();
        System.out.println(calcul.calcul());
    }
}
