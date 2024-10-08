package fr.diginamic.banque.entites;

import fr.diginamic.banque.Compte;
import fr.diginamic.banque.Compte;
import fr.diginamic.banque.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte account = new Compte(100,2500);
        System.out.println(account);

        Compte[] array = new Compte[2];
        array[0] = new Compte(1312,-666);
        array[1] = new CompteTaux(29, 498, 269);

        for(Compte i : array) {
            System.out.println(i.toString() + "\n");
        }
    }
}
