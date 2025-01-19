import exercises.ExerciseSix;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseSixTest {
    @Test
    public void testEvenLengthNumber() {
        int number = 2520;
        ExerciseSix exercise = new ExerciseSix();
        assertEquals(72, exercise.closeInSum(number));
    }
    @Test
    public void testOddLengthNumber() {
        int number = 121;
        ExerciseSix exercise = new ExerciseSix();
        assertEquals(13, exercise.closeInSum(number));
    }
    @Test
    public void testNumberWithZeros() {
        int number = 1039;
        ExerciseSix exercise = new ExerciseSix();
        assertEquals(22, exercise.closeInSum(number));
    }
    @Test
    public void testLargeNumber() {
        int number = 22225555;
        ExerciseSix exercise = new ExerciseSix();
        assertEquals(100, exercise.closeInSum(number));
    }
    @Test
    public void testSingleDigitNumber() {
        int number = 7;
        ExerciseSix exercise = new ExerciseSix();
        assertEquals(7, exercise.closeInSum(number));
    }
    @Test
    public void testNegativeNumber() {
        int number = -2520;
        ExerciseSix exercise = new ExerciseSix();
        assertEquals(72, exercise.closeInSum(number));
    }
    @Test
    public void testZero() {
        int number = 0;
        ExerciseSix exercise = new ExerciseSix();
        assertEquals(0, exercise.closeInSum(number));
    }
}

