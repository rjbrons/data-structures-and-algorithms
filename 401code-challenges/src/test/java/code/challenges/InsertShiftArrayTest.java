package code.challenges;
import org.junit.Test;
import static org.junit.Assert.*;

public class InsertShiftArrayTest {
    @Test public void testShiftArray() {
        ArrayShift classUnderTest = new ArrayShift();
        int[] testArr = new int[] {2,4,6,8};
        int[] outputArr = new int[] {2,4,5,6,8};
        int insertVal = 5;
        assertArrayEquals(outputArr, classUnderTest.insertShiftArray(testArr, insertVal));
    }

    @Test public void testShiftArray2() {
        ArrayShift classUnderTest = new ArrayShift();
        int[] testArr = new int[] {4,8,15,23,42};
        int[] outputArr = new int[] {4,8,15,16,23,42};
        int insertVal = 16;
        assertArrayEquals(outputArr, classUnderTest.insertShiftArray(testArr, insertVal));
    }
}
