package fr.diginamic.jdr;

import java.util.Random;

public class Troll extends Entity {
    public Troll(){
        super(0,0, "Troll",0);
        Random random = new Random();
        this.strength = random.nextInt(6) + 10;
        this.pv = random.nextInt(11) + 20;
        this.maxPv = this.pv;
    }

    @Override
    public boolean isAlive() {
        if(this.pv <= 0){
            System.out.println("Vous avez tué le troll !");
            return false;
        } else {
            return true;
        }
    }
}
