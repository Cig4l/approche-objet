package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Théâtre Molière", 300,150,1500.0);
        theatre.inscrire(155,10);
        theatre.inscrire(1,10);
        System.out.println(theatre.getRevenue());
        System.out.println(theatre.getCustomers());
    }
}
