public class Board {
    private static final int sideLength = 8;
    public static boolean checkIfInRange(int indexRow, int indexCol)
    {
        if (indexRow < 1 || indexCol < 1 || indexRow >sideLength || indexCol > sideLength)
        {
            return false;
        }
        return true;
    }
}
