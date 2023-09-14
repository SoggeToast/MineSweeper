import java.util.*;

import org.w3c.dom.events.MouseEvent;

import java.awt.event.MouseListener;
import java.io.*;
import java.io.IOException;

public class minesweeper{
    public static minesweeper game = new minesweeper();
    private static Board gameBoard;
    private boolean FM = true;
    private static GeometricShape shape;

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        System.out.print("How many squares wide do you want the board to be: ");
        int width = input.nextInt();

        gameBoard = new Board(width, width);

        shape = new GeometricShape(width);
        shape.MyPanel();



    }

    public void handleInput(){
        //System.out.println(GeometricShape.getW());
        int x = GeometricShape.getxvalue();
        int y = GeometricShape.getyvalue();
        int col = (int)(x-10)/50;
        int row = (int)(y-130)/50;
        if(FM == true){
            gameBoard.InitNewBoard(row, col);
            FM = false;
        }else{
            int guess = gameBoard.exposeSpace(row, col);
            if(guess == 0){
                shape.setpreviousguess(guess);
            }
        }
        shape.frame.getContentPane().repaint();
        gameBoard.printBoard();



        System.out.println(row + "        " + col);

    }
}