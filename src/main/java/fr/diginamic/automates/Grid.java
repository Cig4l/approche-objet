package fr.diginamic.automates;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Grid {
    private Cell[][] grid;
    int choice;
    int height;
    int width;

    public Grid(int choice) throws IOException {
        this.choice = choice;
        List<String> lines = chooseAutomaton(this.choice);
        this.height = lines.size();

        for(int i = 0; i < lines.size(); i++) {
            String cleanedLine = lines.get(i).replace(";", "");
            lines.set(i, cleanedLine);
        }

        this.width = lines.getLast().length();
        this.grid = new Cell[this.height][this.width];

        emptyGrid(height, width);

        for(int i=0; i<this.height; i++){
            for(int j=0; j<this.width; j++){
                if(lines.get(i).charAt(j) == '1'){
                    this.grid[i][j].setCell(true);
                }
            }
        }
    }

    public List<String> chooseAutomaton(int choice) throws IOException {
        switch(choice){
            case 1:
                Path path1 = Paths.get("/home/cigale/IdeaProjects/approche-objet/src/main/java/fr/diginamic/automates/smallOscillator.csv");
                return Files.readAllLines(path1);
            case 2:
                Path path2 = Paths.get("/home/cigale/IdeaProjects/approche-objet/src/main/java/fr/diginamic/automates/bigOscillator.csv");
                return Files.readAllLines(path2);
            case 3:
                Path path3 = Paths.get("/home/cigale/IdeaProjects/approche-objet/src/main/java/fr/diginamic/automates/smallSpaceShip.csv");
                return Files.readAllLines(path3);
            case 4:
                Path path4 = Paths.get("/home/cigale/IdeaProjects/approche-objet/src/main/java/fr/diginamic/automates/bigSpaceShip.csv");
                return Files.readAllLines(path4);
            default:
                System.out.println("Veuillez faire un choix valide");
                return List.of();
        }
//        if(choice == 1){
//            Path path = Paths.get("/home/cigale/IdeaProjects/approche-objet/src/main/java/fr/diginamic/automates/smallOscillator.csv");
//            return Files.readAllLines(path);
//        } else if (choice == 2) {
//            Path path = Paths.get("/home/cigale/IdeaProjects/approche-objet/src/main/java/fr/diginamic/automates/bigOscillator.csv");
//            return Files.readAllLines(path);
//        }
//        System.out.println("Veuillez faire un choix valide");
//        return List.of();
    }

    public void emptyGrid(int height, int width){
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                this.grid[i][j] = new Cell(false);
            }
        }
    }

    public void print(){
        String row = "";

        for(int i=0; i<this.grid.length; i++){
            for(int j=0; j<this.grid[0].length; j++){
                if(this.grid[i][j].getCell()){
                    row+="| X ";
                } else {
                    row+="|   ";
                }
            }
            row+="|";
            System.out.println(row);
            row = "";
        }
        System.out.println("\n");
    }

    public Cell[][] getGrid() {
        return grid;
    }

    public void setGrid(Cell[][] grid) {
        this.grid = grid;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
