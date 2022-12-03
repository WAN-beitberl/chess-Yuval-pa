public class King extends Piece{
    public King(boolean side)
    {
        super('K',side);
        if (!side)
            this.rowPosition = 8;
        else
            this.rowPosition = 1;
        this.colPosition = 5;

    }
    @Override
    public boolean checkIfMoveLegal(int indexRow, int indexCol) {
        int tempRow = indexRow - this.rowPosition;
        int tempCol = indexCol - this.rowPosition;
        if (!Board.checkIfInRange(indexRow, indexCol))
            return false;
        switch (tempRow) {
            case (-1):
            case (0):
            case (1):
                break;
            default:
                return false;
        }
        switch (tempCol){
            case (-1):
            case (0):
            case (1):
                return true;
            default:
                return false;
        }
    }

}
