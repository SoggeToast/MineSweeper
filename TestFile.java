import java.util.*;
import java.io.*;
public class TestFile{                  // For all your Testing needs!!
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        Board b = new Board(10,10);
    
        b.printBoard();
    
        System.out.print("Your first guess? format your answer as so \"x,y\": ");
        int x = in.nextInt();
        int y = in.nextInt();
        
        b.InitNewBoard(20, x-1, y-1);
        while(true){
            System.out.print("Enter x and y coordinates as so (x,y):");
            b.exposeSpace(y-1,x-1);
            b.printBoard();
        }
        
        
        
    }
}
