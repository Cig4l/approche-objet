package fr.diginamic.banque.entites;

import fr.diginamic.banque.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte account = new Compte(100,2500);
        System.out.println(account);
    }
}
