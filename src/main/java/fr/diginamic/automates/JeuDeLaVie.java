package fr.diginamic.automates;

import java.io.IOException;

public class JeuDeLaVie {
    public static void main(String[] args) throws IOException {
        Grid grid = new Grid(1);
        Rules rules = new Rules(grid);
        grid.print();
        rules.play();
        grid.print();
        rules.play();
        grid.print();
    }
}
