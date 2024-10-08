package fr.diginamic.maison;

public class Piece {
    private Double surfaceArea;
    private Integer floorNumber;

    public Piece(Double surfaceArea, Integer floorNumber) {
        if(!(surfaceArea instanceof Double)){
            System.out.println("\nERREUR : veuillez entrer une superficie de type double.");
        } else if(!(floorNumber instanceof Integer) || floorNumber < 0) {
            System.out.println("\nERREUR : veuillez entrer un numéro d'étage valide");
        }
        this.surfaceArea = surfaceArea;
        this.floorNumber = floorNumber;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
