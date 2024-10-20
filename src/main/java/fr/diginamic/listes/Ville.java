package fr.diginamic.listes;

import java.util.Objects;

public class Ville {
    private String name;
    private Integer population;

    public Ville(String name, Integer population){
        this.name = name;
        this.population = population;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Ville)) {
            return false;
        }

        // (Cast) = pour forcer un typage
        Ville other = (Ville) obj;     // pour ne plus être une instance Object

        return Objects.equals(this.population, other.getPopulation()) && Objects.equals(this.name, other.getName());
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
