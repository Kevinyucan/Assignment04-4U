/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class Dalek {
    private int col;
    private int row;
    private boolean dalekCrash = false;
    public Dalek(int row, int col){
        //initialize instance variables
       this.row = row;
        this.col = col; 
    }
    
    public void move(Doctor doctor){
        
        int docRow = doctor.getRow();
          int docCol = doctor.getCol();
 
        if (!dalekCrash){
        //move left if dalek is to right of doctor and is on the same row
        if(this.row > docRow){
            this.row--;
        }
        //move right if dalek is to left of doctor and is on the same column
        else if(this.row < docRow){
            this.row++;
        }
        //move up if dalek is below doctor and is on the same row
        if(this.col > docCol){
            this.col--;
        }
        //move down if dalek is below doctor
        else if(this.col < docCol){
            this.col++;
        }
    }
        System.out.println(this.row + ", " + this.col);
    }
    
    public void crash(){
        dalekCrash = true;
    }
    
    public boolean hasCrashed(){
        return dalekCrash;
    }
    
    public int getRow(){
        return this.row;
}
    public int getCol(){
        return this.col;
    }        
}
