package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

import java.util.ArrayList;

public class TestMoyenne {
    public static void main(String[] args) {
        Double[] array = new Double[]{12.0, 10.5, 8.5, 16.0, 17.0};
        CalculMoyenne calcul = new CalculMoyenne(array);

        calcul.ajout(5.0);
        calcul.printArrayList();
        System.out.println(calcul.calcul());
    }
}
