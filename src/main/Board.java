package main;

public class Board {
    public static final int sideLength = 8;
    public static boolean checkIfInRange(int indexRow, int indexCol)
    {
        if (indexRow < 1 || indexCol < 1 || indexRow >sideLength || indexCol > sideLength)
        {
            return false;
        }
        return true;
    }

    // TODO: finish printing the board, needs a way to know the position of every piece without calling getPosition() all the time.
    public static void printBoard(Player white, Player black){
        System.out.println("    A   B   C   E   F   G   H");
        for(int i=0;i<sideLength;i++)
        {
            System.out.print(i + "  ");
            for(int j =0; j<sideLength;j++){

            }
        }
    }
}
