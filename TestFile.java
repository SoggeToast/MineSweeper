import java.util.*;
import java.io.*;
public class TestFile{                  // For all your Testing needs!!
    public static void main(String[] args) throws IOException{
        Board b = new Board(10,10);
        b.InitNewBoard(20, 4, 4);
        System.out.println(b);
        b.exposeEmptySpace(4, 0);
        b.printBoard();
        
    }
}
