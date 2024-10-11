package fr.diginamic.maps;

import java.util.HashMap;

public class CreationMap {
    public static void main(String[] args) {
        HashMap<String, String> employeesMap = new HashMap<>();
        employeesMap.put("Paul", "1750 €");
        employeesMap.put("Hicham", "1825 €");
        employeesMap.put("Yu", "2250 €");
        employeesMap.put("Ingrid", "2015 €");
        employeesMap.put("Chantal", "2418 €");

        System.out.println("Taille de la map employés : " + employeesMap.size());
    }
}
