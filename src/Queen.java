public class Queen extends Piece{
    public Queen(boolean isBlack)
    {
        super('Q',isBlack);
        if (isBlack)
            this.rowPosition = 7;
        else
            this.rowPosition = 0;
        this.colPosition = 3;

    }
    @Override
    // TODO: write the logic of the queen movement
    public boolean checkIfMoveLegal(int indexRow, int indexCol) {
        if (!super.checkIfMoveLegal(indexRow, indexCol))
            return false;
        return true;
    }
}
