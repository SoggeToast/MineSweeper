import java.util.*;

import org.w3c.dom.events.MouseEvent;

import java.awt.event.MouseListener;
import java.io.*;
import java.io.IOException;

public class minesweeper{
    public static minesweeper game = new minesweeper();

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        //solveboard game = new solveboard("puzzel.dat", 8, 10);
        //game.begin();

        System.out.print("How many squares wide do you want the board to be: ");
        int width = input.nextInt();

        GeometricShape shape = new GeometricShape(width);
        shape.MyPanel();
        //shape.repaint();

    }

    public void handleInput(){
        //System.out.println(GeometricShape.getW());
        int x = GeometricShape.getxvalue();
        int y = GeometricShape.getyvalue();
        int col = (int)(x-10)/50;
        int row = (int)(y-130)/50;
        System.out.println(col + "        " + row);
    }
}