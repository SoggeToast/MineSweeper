public class block {
    private int mines;
    private int foundMines = 0;
    //make corner variable???? identifyer variables???

    public block(int n){
        mines = n;
    }

    public int getMines(){
        return mines;
    }
    public void setMines(int m){
        mines = m;
    }
}
