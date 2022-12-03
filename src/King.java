public class King extends Piece{
    public King(boolean isBlack)
    {
        super('K',isBlack);
        if (isBlack)
            this.rowPosition = 7;
        else
            this.rowPosition = 0;
        this.colPosition = 4;

    }
    @Override
    public boolean checkIfMoveLegal(int indexRow, int indexCol) {
        int tempRow = indexRow - this.rowPosition;
        int tempCol = indexCol - this.rowPosition;

        if (!super.checkIfMoveLegal(indexRow, indexCol))
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
