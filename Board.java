// Initializes a number based game board 
// Can do so by writing to a file or returning a 2d list 

import java.util.Arrays;

public class Board {
    private int[][] board; 
    private int width;
    private int height; 

     public Board(int w, int h, int amntBombs){
        width = w;
        height = h;
        board = createRandomBoard(amntBombs);
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
     public int[][] createRandomBoard(int amntBombs){
        int[][] newBoard = new int[height][width];
        // KEY
        // -1: Bomb 
        // 0-9: Near-Bomb-Marker
        for(int r = 0; r<height; r++){ // Puts bombs on the board. 
            for(int c = 0; c<width;c++){
               if(amntBombs != 0){
                  if((int)(Math.random()+1)==0){
                     newBoard[r][c] = -1;
                     amntBombs--;
                  }
               }
            }
        }
        
        for(int r = 0; r<height; r++){
         for(int c= 0; c<width; c++){
            int num = newBoard[r][c];
            if(num ==  -1){
               for(int i = -1; i<=1;i++){
                  for(int j = -1; j<=1;j++){
                     if(((r+i>=0&&c+j>=0)||(r+i<height&&c+j<width))&&newBoard[r+i][c+j]!=-1){   // BRUH LOOK!! CONFUSION!!!
                        newBoard[r+i][c+j]++;
                     }
                  }
               }
            }
         }
        }
        board = newBoard; 
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
