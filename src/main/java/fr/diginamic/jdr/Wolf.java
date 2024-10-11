package fr.diginamic.jdr;

import java.util.Random;

public class Wolf extends Entity {

    public Wolf(){
        super(0, 0, "Loup",0);
            Random random = new Random();
            this.strength = strength + (random.nextInt(6) + 3);
            this.pv = pv + (random.nextInt(6) + 5);
            this.maxPv = this.pv;
    }

    @Override
    public boolean isAlive() {
        if(this.pv <= 0){
            System.out.println("Vous avez tué le loup !");
            return false;
        } else {
            return true;
        }
    }
}
