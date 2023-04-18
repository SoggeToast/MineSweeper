// Initializes a number based game board 
// Can do so by writing to a file or returning a 2d list 

import java.util.Arrays;

public class Board {
    private int[][] board; 
    private int width;
    private int height; 

     public Board(int w, int h){
        width = w;
        height = h;
        board = createRandomBoard();
     }
     // Getter and setter methods 
     public int getWidth(){
        return width;
     }
     public int getHeight(){
        return height; 
     }
     public void setWidth(int w){
        width = w;
     }
     public void setHeight(int h){
        height = h; 
     }

     // Create board as 2d array
     public int[][] createRandomBoard(){
        int[][] newBoard = new int[height][width];

        // I need to ask you how we're going to go about doing this. 


        return newBoard;
     }
     // Returns a formatted board that can be printed. 
     // Is automatically called with println() or print()
     public String toString(){
        String formattedBoard = "";
        for(int[] arr:board){
            formattedBoard += Arrays.toString(arr);
            formattedBoard += "\n";
        }
        return formattedBoard;
     }
}
