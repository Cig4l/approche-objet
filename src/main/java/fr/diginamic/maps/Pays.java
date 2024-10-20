package fr.diginamic.maps;

public class Pays {
    private String name;
    private int inhabitantsNb;
    private String continent;

    public Pays(String name, int inhabitantsNb, String continent){
        this.name = name;
        this.inhabitantsNb = inhabitantsNb;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public int getInhabitantsNb() {
        return inhabitantsNb;
    }

    public String getContinent() {
        return continent;
    }
}
