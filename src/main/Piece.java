package main;

abstract class Piece {
    protected char type;
    protected boolean isBlack; // true for black, false for white
    protected boolean isAlive;
    protected int rowPosition;
    protected int colPosition;
    public Piece(char type, boolean isBlack)
    {
        this.type = type;
        this.isBlack = isBlack;
        this.isAlive = true;
    }
    public int getType(){
        return this.type;
    }
    public boolean getIsBlack(){
        return this.isBlack;
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

    protected boolean checkIfMoveLegal(int indexRow, int indexCol){
        if (!Board.checkIfInRange(indexRow, indexCol))
            return false;

        if (indexRow == this.rowPosition && indexCol == this.colPosition)
            return false;
        return true;
    }
    public void movePiece(int indexRow, int indexCol){
        this.rowPosition = indexRow;
        this.colPosition = indexCol;
    }
}
