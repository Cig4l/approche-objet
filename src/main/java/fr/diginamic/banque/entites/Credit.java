package fr.diginamic.banque.entites;

import fr.diginamic.banque.Operation;

public class Credit extends Operation {
    public Credit(String date, double amount) {
        super(date, amount);
    }

    public String getType(){
        return "CREDIT";
    }
}