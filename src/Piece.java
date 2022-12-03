abstract class Piece {
    protected char type;
    protected boolean side; // true for black, false for white
    protected boolean isAlive;
    protected int rowPosition;
    protected int colPosition;
    public Piece(char type, boolean side)
    {
        this.type = type;
        this.side = side;
        this.isAlive = true;
    }
    public int getType(){
        return this.type;
    }
    public boolean getSide(){
        return this.side;
    }

    public boolean getIsAlive(){
        return this.isAlive;
    }
    public void eat(){
        this.isAlive = false;
    }
    public int[] getPosition(){
        int [] pos ={this.rowPosition,this.colPosition};
        return pos;
    }
    public abstract boolean checkIfMoveLegal(int indexRow, int indexCol);
    public void movePiece(int indexRow, int indexCol){
        this.rowPosition = indexRow;
        this.colPosition = indexCol;
    }
}
