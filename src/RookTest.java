import main.Rook;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class RookTest {
    @Test
    void ShouldNotBeAebuleToMoveToTheSide()
    {
        var rook = new Rook(true, true);
        assertFalse(rook.checkIfMoveLegal(2,5));

    }


}