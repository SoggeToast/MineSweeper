import java.util.*;
import java.io.*;
public class TestFile{                  // For all your Testing needs!!
    public static void main(String[] args) throws IOException{
        Board b = new Board(10,10,10);
        b.createRandomBoard(10);
        System.out.println(b);
        b.createRandomBoard(10);
        System.out.println(b);
    }
}
