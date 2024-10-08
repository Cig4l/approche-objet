package fr.diginamic.essais;
import fr.diginamic.maison.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestMaison {
    public static void main(String[] args) {
        Piece chambre1 = new Chambre(12.0, 1);
        Piece salleDeBain = new SalleDeBain(9.5, 1);
        Piece cuisine = new Cuisine(15.0, 0);
        Piece salon = new Salon(20.0, 0);
        Piece WC = new WC(5.5, 0);

        ArrayList<Piece> array = new ArrayList<>(Arrays.asList(chambre1, salleDeBain, cuisine, salon, WC));
        Maison maison = new Maison(array);

        System.out.println("TESTS CLASSE MAISON");
        System.out.println("Superficie de la maison : " + maison.getHouseSurfaceArea());
        System.out.println("Superficie de l'étage 1 : " + maison.getFloorSurfaceArea(1));
        maison.ajouterPiece(new Chambre(12.0, 1));
        System.out.println("Superficie de la maison : : " + maison.getHouseSurfaceArea());
        System.out.println("Superficie de l'étage 1 : " + maison.getFloorSurfaceArea(1));
        System.out.println("Superficie totale des chambres : " + maison.getTotalAreaByRoomType(chambre1.getClass()));
        System.out.println("Nombre de chambres : " + maison.getNumberOfPiecesByRoomType(chambre1.getClass()));

        System.out.println("\nTESTS CLASSE PIECE");
        System.out.println("Numéro d'étage de la cuisine : " + cuisine.getFloorNumber());
        System.out.println("Superficie de la cuisine : " + cuisine.getSurfaceArea());

        maison.ajouterPiece(null);
        Maison maisonDeCampagne = new Maison(new ArrayList<Piece>());
        maisonDeCampagne.ajouterPiece(new Salon(20.0, -1));
    }
}
