import java.util.*;
import java.io.*;

public class solveboard {
    private String useFile;
    private Block[][] board;
    private boolean gameon = true;

    public solveboard(String f, int r, int c) throws IOException{
        useFile = f;
        Scanner in = new Scanner(new File(f));
        board = new Block[r][c];
        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board[x].length; y++){
                board[x][y] = new Block(in.nextInt());
            }
        }
    }

    public void begin() throws IOException{
        while(gameon){
            flag();
            makeGuess();
            checkGuess();
        }
    }

    public void flag(){

    }

    public void makeGuess(){

    }

    public void checkGuess() throws IOException{
        Scanner in = new Scanner(System.in);
        printBoard();
        System.out.println("Is this good?");
        String answer = in.next();
        //in.close(); - Breaks code because once you close System.in, it cannot be opened again (bruh)
        if(answer.toLowerCase().equals("yes")){
            System.out.println("yay!"); 
            updateBoard();     
        } else{
            System.out.println("aw");
            gameon = false;
        }
    }

    public void updateBoard() throws IOException{
        Scanner in = new Scanner(new File(useFile));
        Scanner user = new Scanner(System.in);
        String done = "";
        while(!(done.toLowerCase().equals("yes"))){
            System.out.println("errmm r ya done changing the file?");
            done = user.next();
        }
        System.out.println(":)");
        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board[x].length; y++){
                int mayReplace = in.nextInt();
                if(mayReplace != board[x][y].getMines()){
                    board[x][y].setMines(mayReplace);
                }
            }
        }
    }

    public void printBoard(){
        for(Block[] x : board){
            for(Block y : x){
                System.out.print(y.getMines() + " ");
            }
            System.out.println();
        }
    }
}
