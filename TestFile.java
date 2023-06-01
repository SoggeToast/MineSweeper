import java.util.*;
import java.io.*;
public class TestFile{                  // For all your Testing needs!!
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        Board b = new Board(10,10);
        String inS;
    
        b.printBoard();
        System.out.print("Your first guess? format your answer as so \"x y\": ");
        inS = in.nextLine();
        Scanner input = new Scanner(inS);
        int x = -1;
        int y = -1;
        x = input.nextInt();
        y = input.nextInt();
        System.out.println(inS);
        System.out.println(x + " , " + y);
        input.close();
        
        
        b.InitNewBoard(20, x-1, y-1);
        b.exposeSpace(y, x);
        b.printBoard();
        while(true){
            System.out.print("Enter x and y coordinates as so (x y). If you want to flag enter (f):");
            inS = in.nextLine();
            System.out.println(inS);
            input = new Scanner(inS);
            x = input.nextInt();
            y = input.nextInt(); 
            b.exposeSpace(y-1,x-1);
            b.printBoard();
            input.close();
        }
        
        
        
        
    }
}
