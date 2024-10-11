package fr.diginamic.jdr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        Hero hero = null;

        while(choice != 4) {
            System.out.println("\n||||||||||  MENU  ||||||||||");
            System.out.println("1. Créer un personnage");
            System.out.println("2. Combattre");
            System.out.println("3. Quitter");

            choice = scanner.nextInt();

            if (choice == 1) {
                hero = new Hero();
                hero.printHeroInfo();
            } else if (choice == 2) {
                if(hero != null){
                    Fight fight = new Fight();
                    fight.fight(hero);
                } else {
                    System.out.println("Vous devez d'abord créer un personnage avant de combattre !");
                }
            } else if(choice == 3){
                break;
            }
        }

//        Hero hero = new Hero();
//        hero.printHeroInfo();
//        Fight fight = new Fight();
//        Characters enemy = fight.getRandomEnemy();
//        fight.fight(hero);
    }
}
