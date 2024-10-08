package fr.diginamic.operations;

public class CalculMoyenneSansArrayList {
    private Double[] array;

    public CalculMoyenneSansArrayList(Double[] array) {
        this.array = array;
    }

    public void resizeArray(){
        if(array[array.length-1] != 0.0) {
            Double[] arrayCopy = new Double[array.length+1];
            int counter = 0;
            for(Double number : array) {
                arrayCopy[counter] = number;
                counter++;
            }
            array = arrayCopy;
        }
    }

    public void ajouter(double number) {
        resizeArray();
        array[array.length-1] = number;
        System.out.println(array[array.length-1]);
    }

    public void printNumbers(){
        System.out.println("\nNotes : ");
        for(Double number : array) {
            System.out.println(number);
        }
    }

    public String calcul(){
        double res = 0;
        int counter = 0;

        for(Double number : this.array) {
            res+=number;
            counter++;
        }

        return "\nMoyenne de la classe : " + res/counter;
    }
}
