package fr.diginamic.automates;

import java.util.ArrayList;

public class Rules {
    private Grid grid;

    public Rules(Grid grid){
        this.grid = grid;
    }

    public void play(){
        ArrayList<Integer>[] cellsArr = deathOrLife();

        for(int i=0; i<cellsArr[0].size(); i++){
            int rowDeath = cellsArr[0].get(i);
            int colDeath = cellsArr[1].get(i);

            this.grid.getGrid()[rowDeath][colDeath].setCell(false);
        }

        for(int j=0; j<cellsArr[2].size(); j++){
            int rowBirth = cellsArr[2].get(j);
            int colBirth = cellsArr[3].get(j);
            this.grid.getGrid()[rowBirth][colBirth].setCell(true);
        }
    }

    public ArrayList<Integer>[] deathOrLife(){
        int counter = 0;    // compte le nombre de cell adj
        ArrayList<Integer> deleteRowArr = new ArrayList<Integer>();
        ArrayList<Integer> deleteColArr = new ArrayList<Integer>();
        ArrayList<Integer> addRowArr = new ArrayList<Integer>();
        ArrayList<Integer> addColArr = new ArrayList<Integer>();
        ArrayList<Integer>[] cellsArr = new ArrayList[]{deleteRowArr, deleteColArr, addRowArr, addColArr};

        for(int row=0; row<this.grid.height; row++){
            for(int col=0; col<this.grid.width; col++){
                if (checkCell(row - 1, col - 1)) {
                    counter++;
                }
                if (checkCell(row - 1, col)) {
                    counter++;
                }
                if (checkCell(row - 1, col + 1)) {
                    counter++;
                }
                if (checkCell(row, col - 1)) {
                    counter++;
                }
                if (checkCell(row, col + 1)) {
                    counter++;
                }
                if (checkCell(row + 1, col - 1)) {
                    counter++;
                }
                if (checkCell(row + 1, col)) {
                    counter++;
                }
                if (checkCell(row + 1, col + 1)) {
                    counter++;
                }

                if (checkCell(row, col)) {
                    if (counter != 2 && counter != 3) {
                        deleteRowArr.add(row);
                        deleteColArr.add(col);
                    }
                } else {
                    if (counter == 3) {
                        addRowArr.add(row);
                        addColArr.add(col);
                    }
                }
                counter = 0;
            }
        }

        return cellsArr;
    }

    public boolean checkCell(int row, int col){
        if(row > 0 && row < this.grid.height && col > 0 && col < this.grid.width){
            if(this.grid.getGrid()[row][col].getCell()){
                return true;
            }
        }
        return false;
    }
}
