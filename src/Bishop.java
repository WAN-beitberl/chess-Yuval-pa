import static java.lang.Math.abs;

public class Bishop extends Piece{

    public Bishop(boolean isBlack, boolean isOnC){
        super('B',isBlack);

        if(isBlack)
            this.rowPosition = 7;
        else
            this.rowPosition = 0;

        if (isOnC)
            this.rowPosition = 2;
        else
            this.colPosition = 5;

    }
    @Override
    // TODO : Figure out how to check all the squares on the movement vector
    public boolean checkIfMoveLegal(int indexRow, int indexCol) {
        int vecRow = indexRow - this.rowPosition;
        int vecCol = indexCol - this.colPosition;

        if (!super.checkIfMoveLegal(indexRow, indexCol))
            return false;

        if (abs(vecRow) != abs(vecCol) || abs(vecRow) <= 0){
            return false;
        }
        return true;
    }

}
