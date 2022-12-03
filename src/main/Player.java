package main;

public class Player
{
    private Piece pieces[];
    private int moveCounter;
    private boolean isBlack;

    public Player(boolean isBlack)
    {
        this.isBlack = isBlack;
        this.pieces = new Piece[16];
        initPieces();
        this.moveCounter = 0;
    }

    private void initPieces(){
        this.pieces[0] = new King(this.isBlack);
        this.pieces[1] = new Queen(this.isBlack);
        this.pieces[2] = new Rook(this.isBlack, true);
        this.pieces[3] = new Rook(this.isBlack, false);
        this.pieces[4] = new Bishop(this.isBlack,true);
        this.pieces[5] = new Bishop(this.isBlack,false);
        this.pieces[6] = new knight(this.isBlack, true);
        this.pieces[7] = new knight(this.isBlack, false);
        for (int i = 0; i< Board.sideLength; i++)
        {
            this.pieces[8 + i] = new Pawn(this.isBlack, i);
        }

    }
}
