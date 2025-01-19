import exercises.ExerciseSix;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseSixTest {

    private ExerciseSix exercise;

    @Before
    public void setUp() {
        exercise = new ExerciseSix();
    }

    @Test
    public void testEvenLengthNumber() {
        int number = 2520;
        assertEquals(72, exercise.closeInSum(number));
    }

    @Test
    public void testOddLengthNumber() {
        int number = 121;
        assertEquals(13, exercise.closeInSum(number));
    }

    @Test
    public void testNumberWithZeros() {
        int number = 1039;
        assertEquals(22, exercise.closeInSum(number));
    }

    @Test
    public void testLargeNumber() {
        int number = 22225555;
        assertEquals(100, exercise.closeInSum(number));
    }

    @Test
    public void testSingleDigitNumber() {
        int number = 7;
        assertEquals(7, exercise.closeInSum(number));
    }

    @Test
    public void testNegativeNumber() {
        int number = -2520;
        assertEquals(72, exercise.closeInSum(number));
    }

    @Test
    public void testZero() {
        int number = 0;
        assertEquals(0, exercise.closeInSum(number));
    }
}

