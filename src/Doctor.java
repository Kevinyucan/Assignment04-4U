/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class Doctor {
    //create private integer variables for storing row and col of doctor
    private int row;
    private int col;
    
    
    
   
    
    /**
     * A constructor to create a new Doctor
     * @param row the row the doctor is on
     * @param col the column the doctor is on
     */
    public Doctor(int row, int col){
        //initialize instance variables
       this.row = row;
        this.col = col; 
    }
    
    /**
     * Return the row and column position of the doctor after it moved
     * @param newRow return the new row
     * @param newCol return the new column
     */
    public void move(int newRow, int newCol){
        //create 2 random numbers from 1-12 to set for both the column and row of the teleported doctor
        int randomRow = (int) (Math.random()*12);
        int randomCol = (int) (Math.random()*12);
        //does the doctor move 1 space, or does it tp if u move farther than 1 space
        
        //if the new row and col stated is within 1 grid of the old row and col of the doctor
        if(this.row - newRow <= 1 && this.row - newRow >= -1 
                && this.col - newCol <= 1 && this.col - newCol >= -1) {
            //set the doctor's row as the new row inputed
            this.row = newRow;
            //set the doctor's column as the new column inputed
            this.col = newCol;
        
        }else{
            //or else, if the new row and column is not within 1 grid of the old position of the doctor,
            //randomly teleport the doctor to a random row and column
            //set doctor's row to random value from 1-12
     this.row = randomRow;
        //set doctor's column to random value from 1-12
        this.col = randomCol;
        } 
     
    }
    /**
     * Returns the row of the doctor
     * @return the row of the doctor
     */
    public int getRow(){
        return this.row;
}   /**
 * Returns the column of the doctor
 * @return the column of the doctor
 */
    public int getCol(){
        return this.col;
    }        
    
}
