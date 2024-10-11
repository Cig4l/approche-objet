package fr.diginamic.jdr;

import java.util.Random;

public class Goblin extends Entity {
    public Goblin(){
        super(0,0, "Gobelin",0);
        Random random = new Random();
        this.strength = random.nextInt(6) + 5;
        this.pv = random.nextInt(6) + 10;
        this.maxPv = this.pv;
    }

    @Override
    public boolean isAlive() {
        if(this.pv <= 0){
            System.out.println("Vous avez tué le gobelin !");
            return false;
        } else {
            return true;
        }
    }
}
