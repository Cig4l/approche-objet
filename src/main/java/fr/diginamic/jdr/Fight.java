package fr.diginamic.jdr;

import java.util.Random;

public class Fight {

    public Entity getRandomEnemy(){
        Random random = new Random();
        int number = random.nextInt(3);

        if(number == 0){
            return new Wolf();
        } else if (number == 1) {
            return new Troll();
        } else {
            return new Goblin();
        }
    }

    public void fight(Hero hero){
        Entity enemy = getRandomEnemy();
        Random random = new Random();

        System.out.println("\nUn " + enemy.getType() + " veut combattre !");

        while(hero.getPv() > 0 && enemy.getPv() > 0){
            int heroAttack = hero.getStrength() + random.nextInt(10) + 1;
            int enemyAttack = enemy.getStrength() + random.nextInt(10) + 1;

            if(heroAttack > enemyAttack){
                int damage = heroAttack - enemyAttack;
                enemy.setPv(enemy.getPv() - damage);
                System.out.println("\nVous attaquez : " + damage + " de dégâts");
                System.out.println("PV du " + enemy.getType() + " : " + enemy.getPv() + "/" + enemy.getMaxPv());
                System.out.println("Vos PV : " + hero.getPv() + "/" + hero.getMaxPv());
            } else if (enemyAttack > heroAttack) {
                int damage = enemyAttack - heroAttack;
                hero.setPv(hero.getPv() - damage);
                System.out.println("\nLe " + enemy.getType() + " attaque ! : " + damage + " de dégâts");
                System.out.println("PV du " + enemy.getType() + " : " + enemy.getPv() + "/" + enemy.getMaxPv());
                System.out.println("Vos PV : " + hero.getPv() + "/" + hero.getMaxPv());
            } else {
                System.out.println("\nEgalité : Quel combat épique !");
            }
        }
        if(hero.isAlive()){
            hero.setScore(hero.getScore() + 1);
            System.out.println("`\nVous avez vaincu le " + enemy.getType() + " !");
            System.out.println("VOTRE SCORE : " + hero.getScore());
        } else {
            System.out.println("Votre personnage n'a plus de PV. \nSCORE FINAL : " + hero.getScore());
        }
    }
}

