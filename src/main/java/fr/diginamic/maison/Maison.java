package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {
    private ArrayList<Piece> array;

    public Maison(ArrayList<Piece> array) {
        this.array = array;
    }

    public void ajouterPiece(Piece piece){
        if(!(piece instanceof Piece)) {
            System.out.println("\nERREUR : veuillez ajouter une pièce");
        } else {
            array.add(piece);
        }
    }

    public double getHouseSurfaceArea(){
        double houseSurfaceArea = 0.0;

        for(Piece piece : this.array){
            houseSurfaceArea += piece.getSurfaceArea();
        }

        return houseSurfaceArea;
    }

    public double getFloorSurfaceArea(Integer floorNumber){
        double floorSurfaceArea = 0.0;

        if(!(floorNumber instanceof Integer)) {
            System.out.println("\nERREUR : veuillez rentrer un nombre.");
            return 0.0;
        }

        for(Piece piece : array){
            if(piece.getFloorNumber() == floorNumber) {
                floorSurfaceArea+=piece.getSurfaceArea();
            }
        }

        return floorSurfaceArea;
    }

    public double getTotalAreaByRoomType(Class<?> roomType){
        double res = 0.0;

        for(Piece room : array) {
            if(room.getClass() == roomType){
                res+=room.getSurfaceArea();
            }
        }

        return res;
    }

    public int getNumberOfPiecesByRoomType(Class<?> roomType){
        int res = 0;

        for(Piece room : array) {
            if(room.getClass() == roomType){
                res++;
            }
        }

        return res;
    }

}
