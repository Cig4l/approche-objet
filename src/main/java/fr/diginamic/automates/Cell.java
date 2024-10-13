package fr.diginamic.automates;

public class Cell {
    private boolean cell;

    Cell(boolean cell){
        this.cell = cell;
    }

    public String stringCell(){
        if(this.cell){
            return " X ";
        } else {
            return "   ";
        }
    }

    public boolean getCell(){
        return this.cell;
    }

    public void setCell(boolean cell) {
        this.cell = cell;
    }
}
