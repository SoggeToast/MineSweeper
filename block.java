public class Block {
    private int mines;      //if theres mines around it; -1 if it is a mine
    private int foundMines = 0;    // Mines around the tile(if it isnt a mine itself)
    //make corner variable???? identifyer variables???

    public Block(int n){
        mines = n;
    }

    public int getMines(){
        return mines;
    }
    public void setMines(int m){
        mines = m;
    }
}
