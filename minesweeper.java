import java.io.IOException;

public class minesweeper{
    public static void main(String[] args) throws IOException{
        solveboard game = new solveboard("puzzel.dat", 8, 10);
        game.begin();
    }
}