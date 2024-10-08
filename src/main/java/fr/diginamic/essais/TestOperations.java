package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        Operations operations = new Operations();
        System.out.println(operations.calcul(28,22,'+'));
        System.out.println(operations.calcul(12,42,'-'));
        System.out.println(operations.calcul(50,30,'*'));
        System.out.println(operations.calcul(1312,269,'/'));
    }
}
