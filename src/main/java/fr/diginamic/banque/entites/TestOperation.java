package fr.diginamic.banque.entites;

import fr.diginamic.banque.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] array = new Operation[8];
        double res = 0;

        array[0] = new Credit("7/10/2024",500);
        array[1] = new Credit("8/10/2024",400);
        array[2] = new Credit("9/10/2024",300);
        array[3] = new Credit("10/10/2024",200);

        array[4] = new Debit("11/10/2024", 100);
        array[5] = new Debit("11/10/2024", 50);
        array[6] = new Debit("12/10/2024", 150);
        array[7] = new Debit("13/10/2024", 10);

        for(Operation operation : array) {
            System.out.println(operation.getType() + "\n" + operation.toString() +"\n");
            if(operation.getType().equals("CREDIT")) {
                res+=operation.getAmount();
            } else {
                res-=operation.getAmount();
            }
        }

        System.out.println("\nRESULTAT : " + res);
    }
}
