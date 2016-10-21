
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
        Board board = new Board(12,12);
        //put a coloured peg at row, col
        
        
//        board.putPeg(Color.RED, 1, 5);
//        board.putPeg(Color.YELLOW, 1, 6);
//        board.removePeg(1, 5);
        
        
         Doctor doctor = new Doctor(6, 6);
         board.putPeg(Color.PINK,6, 6);
        //put message on board
        board.displayMessage("");
        
       
      while(true){
            
          //  board.removePeg(dRow,dCol);
        Coordinate click = board.getClick();
          board.removePeg(doctor.getRow(), doctor.getCol());
        doctor.move(click.getRow(), click.getCol());
        
       
        board.putPeg(Color.PINK,doctor.getRow(), doctor.getCol());
        
      }
    }
}
