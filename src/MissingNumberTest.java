import static org.junit.Assert.*;

import org.junit.Test;


public class MissingNumberTest {
    //Tests: 1,2,4,5,6,7
    //Tests:2,3,4,5,6,7,8,9
    //Tests:1,2,3,4,5,6,7,8
    int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int[] missingOne = { 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] missingThree = { 1, 2, 4, 5, 6, 8, 9 };
    MissingNumber mn = new MissingNumber();

    @Test
    public void testMissingNumber_MissingMax() {
        assertEquals(9, mn.missingNumber(missingMax, 9));
    }

    @Test
    public void testMissingNumber_NoneMissing() {
        assertEquals(1, mn.missingNumber(missingOne, 9));
    }

    @Test
    public void testMissingNumber_MissingSeven() {
        assertEquals(3, mn.missingNumber(missingThree, 9));
    }


}
