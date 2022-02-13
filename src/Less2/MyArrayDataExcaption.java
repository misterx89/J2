package Less2;

public class MyArrayDataExcaption extends RuntimeException {

    private int col;
    private int row;

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public MyArrayDataExcaption (String massage, int col, int row){
        super(massage);
        this.col = col;
        this.row = row;
    }
}
