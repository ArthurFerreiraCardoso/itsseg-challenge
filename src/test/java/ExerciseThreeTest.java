import exercises.ExerciseThree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseThreeTest {

    @Test
    public void testValidSequenceOfNumbers() {
        assertEquals("5 1", ExerciseThree.highAndLow("1 2 3 4 5"));
        assertEquals("5 -3", ExerciseThree.highAndLow("1 2 -3 4 5"));
        assertEquals("9 -5", ExerciseThree.highAndLow("1 9 3 4 -5"));
    }

    @Test
    public void testEmptyAndNullInput() {
        assertEquals("", ExerciseThree.highAndLow(""));
        assertEquals("", ExerciseThree.highAndLow(null));
    }
}
