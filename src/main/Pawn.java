package main;

public class Pawn extends Piece {
   private boolean wasMoved;
    public Pawn(boolean isBlack, int i) {
        super('P', isBlack);
        this.wasMoved = false;
        if (isBlack)
            this.rowPosition = 6;
        else
            this.rowPosition = 1;

        this.colPosition = i;
    }

    @Override
    public boolean checkIfMoveLegal(int indexRow, int indexCol) {
        if (!super.checkIfMoveLegal(indexRow, indexCol))
            return false;

        if (indexCol != this.colPosition)
            return false;

        int x = indexRow - this.rowPosition;
        if (this.wasMoved && x != 1)
        {
            return false;
        }

        if (!this.wasMoved && (x>2 || x <1))
            return false;

        return true;
    }
    @Override
    public void movePiece(int indexRow, int indexCol)
    {
        super.movePiece(indexRow, indexCol);
        this.wasMoved = true;
    }
}
