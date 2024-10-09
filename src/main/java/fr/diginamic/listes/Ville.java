package fr.diginamic.listes;

public class Ville {
    private String name;
    private Integer population;

    Ville(String name, Integer population){
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }
}
