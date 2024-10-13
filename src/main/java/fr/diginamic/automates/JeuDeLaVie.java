package fr.diginamic.automates;

import java.io.IOException;
import java.util.Scanner;

public class JeuDeLaVie {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Affichage du menu avant de lire l'entrée utilisateur
        System.out.println("|||||||||||| MENU ||||||||||||");
        System.out.println("Veuillez choisir un automate");
        System.out.println("1. Petit oscillateur");
        System.out.println("2. Grand oscillateur");
        System.out.println("3. Petit vaisseau");
        System.out.println("4. Grand vaisseau");
        System.out.println("5. Quitter");

        // Lecture de l'entrée utilisateur après affichage du menu
        int choice1 = scanner.nextInt();
        // Consommer le caractère de nouvelle ligne

        while (choice1 != 5) {
            if (choice1 > 0 && choice1 < 5) {
                Game game = new Game(choice1);
                choice1 = 0;
                game.getGrid().print();

                int choice2 = 0;
                scanner.nextLine(); // Consommer le caractère de nouvelle ligne

                while (choice2 != 2) {
                    System.out.println("1. Continuer");
                    System.out.println("2. Quitter");
                    choice2 = scanner.nextInt();

                    if (choice2 == 1) {
                        game.run();
                        game.getGrid().print();
                        System.out.println("1. Continuer");
                        System.out.println("2. Quitter");
                    } else if(choice2 == 2){
                        break;
                    }
                    choice2 = scanner.nextInt();
                    scanner.nextLine(); // Consommer le caractère de nouvelle ligne
                }
            } else {
                break;
            }
        }

        scanner.close();
    }
}