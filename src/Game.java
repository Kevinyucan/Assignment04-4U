
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create game board
        Board board = new Board(12, 12);
   

        //create new doctor class at random location on board, and set its location as a green peg
        Doctor doctor = new Doctor((int) (Math.random() * 12), (int) (Math.random() * 12));
        board.putPeg(Color.GREEN, doctor.getRow(), doctor.getCol());
     
        
        //create three new dalek's also at random locations on the board, and set each dalek position as a black peg
        Dalek dalek1 = new Dalek((int) (Math.random() * 12), (int) (Math.random() * 12));
        board.putPeg(Color.BLACK, dalek1.getRow(), dalek1.getCol());
        Dalek dalek2 = new Dalek((int) (Math.random() * 12), (int) (Math.random() * 12));
        board.putPeg(Color.BLACK, dalek2.getRow(), dalek2.getCol());
        Dalek dalek3 = new Dalek((int) (Math.random() * 12), (int) (Math.random() * 12));
        board.putPeg(Color.BLACK, dalek3.getRow(), dalek3.getCol());
        
        
        //if doctor accidentally spawns on the same position as dalek1, re-randomize the doctor's position
        if(doctor.getRow()==dalek1.getRow() && doctor.getCol()==dalek1.getCol()){
            doctor = new Doctor((int) (Math.random() * 12), (int) (Math.random() * 12));
        board.putPeg(Color.GREEN, doctor.getRow(), doctor.getCol());
        }
        //if doctor accidentally spawns on the same position as dalek2, re-randomize the doctor's position
        if(doctor.getRow()==dalek2.getRow() && doctor.getCol()==dalek2.getCol()){
            doctor = new Doctor((int) (Math.random() * 12), (int) (Math.random() * 12));
        board.putPeg(Color.GREEN, doctor.getRow(), doctor.getCol());
        }
        //if doctor accidentally spawns on the same position as dalek3, re-randomize the doctor's position
        if(doctor.getRow()==dalek3.getRow() && doctor.getCol()==dalek3.getCol()){
            doctor = new Doctor((int) (Math.random() * 12), (int) (Math.random() * 12));
        board.putPeg(Color.GREEN, doctor.getRow(), doctor.getCol());
        }
        
        
        //if dalek's acidentally spawn on each other, re-randomize their positions
        if(dalek1.getRow() == dalek2.getRow() && dalek1.getCol() == dalek2.getCol()){
        dalek1 = new Dalek((int) (Math.random() * 12), (int) (Math.random() * 12));
        board.putPeg(Color.BLACK, dalek1.getRow(), dalek1.getCol());
        }
        //if dalek's acidentally spawn on each other, re-randomize their positions
        if(dalek1.getRow() == dalek3.getRow() && dalek1.getCol() == dalek3.getCol()){
          dalek1 = new Dalek((int) (Math.random() * 12), (int) (Math.random() * 12));
          board.putPeg(Color.BLACK, dalek1.getRow(), dalek1.getCol());
        }
        //if dalek's acidentally spawn on each other, re-randomize their positions
        if(dalek3.getRow() == dalek2.getRow() && dalek3.getCol() == dalek2.getCol()){
            dalek2 = new Dalek((int) (Math.random() * 12), (int) (Math.random() * 12));
        board.putPeg(Color.BLACK, dalek2.getRow(), dalek2.getCol());
        }
        
        
        
        while (true) {
            //if dalek1 is on the same point at dalek2
            if (dalek1.getRow() == dalek2.getRow() && dalek1.getCol() == dalek2.getCol()) {
                //call crash method on dalek1 and dalek2 
                dalek1.crash();
                dalek2.crash();
                //put a red peg at crash site
                board.putPeg(Color.RED, dalek1.getRow(), dalek1.getCol());
            }
            //if dalek1 is on the same point at dalek3
            if (dalek1.getRow() == dalek3.getRow() && dalek1.getCol() == dalek3.getCol()) {
                //call crash method on dalek1 and dalek3 
                dalek1.crash();
                dalek3.crash();
                //put a red peg at crash site
                board.putPeg(Color.RED, dalek1.getRow(), dalek1.getCol());
            }
            //if dalek2 is on the same point at dalek3
            if (dalek2.getRow() == dalek3.getRow() && dalek2.getCol() == dalek3.getCol()) {
                //call crash method on dalek2 and dalek3 
                dalek2.crash();
                dalek3.crash();
                //put a red peg at crash site
                board.putPeg(Color.RED, dalek2.getRow(), dalek2.getCol());
                
            }
            //get a click position on the board
            Coordinate click = board.getClick();
            //remove the old position of the doctor
            board.removePeg(doctor.getRow(), doctor.getCol());
            //get the new doctor's coords according to the move method in doctor class
            doctor.move(click.getRow(), click.getCol());
            //set the doctor's peg at the new position 
            board.putPeg(Color.GREEN, doctor.getRow(), doctor.getCol());

            
            //if dalek1 hasn't crashed yet(move it towards doctor)
            if(dalek1.hasCrashed() == false){
            //remove the old position of the dalek peg
            board.removePeg(dalek1.getRow(), dalek1.getCol());
            //let the move method get the new coords for dalek1 accoring to where the doctor is
            dalek1.move(doctor);
            //place the red dalek1 peg at the new position
            board.putPeg(Color.BLACK, dalek1.getRow(), dalek1.getCol());
        }
            
            //if dalek2 hasn't crashed yet(move it towards doctor)
            if(dalek2.hasCrashed() == false){
            //remove the old position of the dalek peg
            board.removePeg(dalek2.getRow(), dalek2.getCol());
            //let the move method get the new coords for dalek2 accoring to where the doctor is
            dalek2.move(doctor);
            //place the red dalek2 peg at the new position
            board.putPeg(Color.BLACK, dalek2.getRow(), dalek2.getCol());
            }
            
            //if dalek3 hasn't crashed yet(move it towards doctor)
            if(dalek3.hasCrashed() == false){
            //remove the old position of the dalek peg
            board.removePeg(dalek3.getRow(), dalek3.getCol());
            //let the move method get the new coords for dalek3 accoring to where the doctor is
            dalek3.move(doctor);
            //place the red dalek3 peg at the new position
            board.putPeg(Color.BLACK, dalek3.getRow(), dalek3.getCol());
            }
            
            //if all three dalek's have crashed, the doctor wins!
            if(dalek1.hasCrashed() && dalek2.hasCrashed() && dalek3.hasCrashed()){
                board.displayMessage("The Doctor wins!");
                // if any of the daleks catches the doctor
            } if(dalek1.getRow() == doctor.getRow() && dalek1.getCol() == doctor.getCol()
                    ||dalek2.getRow() == doctor.getRow() && dalek2.getCol() == doctor.getCol()
                    ||dalek3.getRow() == doctor.getRow() && dalek3.getCol() == doctor.getCol()){
                //display game over message
                board.displayMessage("Oh no, Dalek's have won! The Universe is doomed!");
                //put a yellow peg at where doctor was captured
                board.putPeg(Color.YELLOW, doctor.getRow(), doctor.getCol());
                //break the loop, since the doctor can no longer move
                break;
            }
        }
    }
}
