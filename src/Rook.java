public class Rook  extends  Piece{

    public Rook(boolean isBlack, boolean isOnA) {
        super('R', isBlack);
        if (isBlack)
            this.rowPosition = 7;
        else
            this.rowPosition = 0;
        if (isOnA)
            this.colPosition = 0;
        else
            this.colPosition = 7;
    }

    @Override
    public boolean checkIfMoveLegal(int indexRow, int indexCol) {
        if (!super.checkIfMoveLegal(indexRow, indexCol))
            return false;

        if (this.rowPosition != indexRow && this.colPosition != indexCol){
            return false;
        }
        return true;
    }
}
