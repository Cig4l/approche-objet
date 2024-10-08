package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenneSansArrayList;

public class TestMoyenneSansArrayList {
    public static void main(String[] args) {
        Double[] array = new Double[]{12.0,5.0,18.0,14.0};
        CalculMoyenneSansArrayList moyenne = new CalculMoyenneSansArrayList(array);

        System.out.println(moyenne.calcul());
        moyenne.ajouter(9.5);
        moyenne.printNumbers();
        System.out.println(moyenne.calcul());
    }
}
