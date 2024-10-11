package fr.diginamic.jdr;

public abstract class Entity {
    protected int strength;
    protected int pv;
    protected String type;
    protected int maxPv;

    public Entity(int strength, int pv, String type, int maxPv){
        this.strength = strength;
        this.pv = pv;
        this.type = type;
        this.maxPv = maxPv;
    }

    public int getStrength() {
        return strength;
    }

    public int getPv(){
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getMaxPv() {
        return maxPv;
    }

    public abstract boolean isAlive();

    public String getType(){
        return this.type;
    };
}
