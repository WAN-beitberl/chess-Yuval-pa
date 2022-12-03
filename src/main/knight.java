package main;

public class knight extends Piece {
    public knight(boolean isBlack, boolean isOnB) {
        super('N', isBlack);
        if (isBlack)
            this.rowPosition =7;
        else
            this.rowPosition =0;

        if (isOnB)
            this.colPosition =1;
        else
            this.colPosition = 6;
    }

    @Override
    public boolean checkIfMoveLegal(int indexRow, int indexCol) {
        if (!super.checkIfMoveLegal(indexRow, indexCol))
            return false;
        return true;
    }
}
