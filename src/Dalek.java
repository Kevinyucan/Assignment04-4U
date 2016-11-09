/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class Dalek {
    //create private integer variables for storing row and col of dalek
    private int col;
    private int row;
    //create boolean for storing if dalek has crashed or not
    private boolean dalekCrash = false;
    public Dalek(int row, int col){
        //initialize instance variables
       this.row = row;
        this.col = col; 
    }
    
    /**
     * Updates dalek's coords by advancing to doctor
     * @param doctor the coordinate the dalek needs to advance towards
     */
    public void advanceTowards(Doctor doctor){
        
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
        
    }
    
    /**
     * Set dalekCrash boolean to true
     */
    public void crash(){
        dalekCrash = true;
    }
    
    /**
     * Returns if the dalek has crashed or not
     * @return true if dalek has crashed
     */
    public boolean hasCrashed(){
        return dalekCrash;
    }
    /**
     * Returns the row of the dalek
     * @return the row of the dalek
     */
    public int getRow(){
        return this.row;
}
    /**
     * Returns the column of the dalek
     * @return the column of the dalek
     */
    public int getCol(){
        return this.col;
    }        
}
