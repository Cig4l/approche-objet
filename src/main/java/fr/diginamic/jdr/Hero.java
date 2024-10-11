package fr.diginamic.jdr;

import java.util.Random;

public class Hero extends Entity {
    private int score;

    public Hero() {
        super(0, 0, "Héro", 0);
        Random random = new Random();
        this.strength = random.nextInt(7) + 12;
        this.pv = random.nextInt(31) + 20;
        this.score = 0;
        this.maxPv = this.pv;
    }

    @Override
    public boolean isAlive(){
        return this.pv > 0;
    }

    public void printHeroInfo(){
        System.out.println("\nFICHE PERSONNAGE :");
        System.out.println("Force : " + this.strength);
        System.out.println("PV : " + this.pv + "/" + this.maxPv);
    }

    public boolean hasWon(int enemyPv){
        if(enemyPv <= 0){
            this.score++;
            System.out.println("Vous gagnez le combat !");
            System.out.println("SCORE : " + this.score);
            return true;
        } else {
            return false;
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
