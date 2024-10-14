package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringTest = new StringBuilder("i");

        for(int i=0; i<100000; i++){
            stringTest.append(i).append(" ; ");
        }

        long fin = System.currentTimeMillis();

        System.out.println("Temps écoulé en millisecondes : " + (fin - debut));
    }
}
