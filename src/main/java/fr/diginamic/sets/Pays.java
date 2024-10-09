package fr.diginamic.sets;

public class Pays {
    private String name;
    private Integer numberOfInhabitants;
    private Double pibPerInhabitants;

    public Pays(String name, Integer numberOfInhabitants, Double pibPerInhabitants) {
        this.name = name;
        this.numberOfInhabitants = numberOfInhabitants;
        this.pibPerInhabitants = pibPerInhabitants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    public Double getPibPerInhabitants() {
        return pibPerInhabitants;
    }
}
