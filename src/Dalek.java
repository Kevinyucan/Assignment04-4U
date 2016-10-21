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
    
    public Dalek(int row, int col){
        //initialize instance variables
       this.row = row;
        this.col = col; 
    }
    
    public void move(int docRow, int docCol){
        //move left if dalek is to right of doctor
        if(this.row - docRow >0 && this.row == docRow){
            this.row--;
        }
        //move right if dalek is to left of doctor
        if(this.row - docRow <0 && this.row == docRow){
            this.row++;
        }
        //move left
        if(this.row - docRow >0 && this.row == docRow){
            this.row--;
        }
        if(this.row - docRow >0 && this.row == docRow){
            this.row--;
            this.col--;
        }
    }
    
    public int getRow(){
        return this.row;
}
    public int getCol(){
        return this.col;
    }        
}
