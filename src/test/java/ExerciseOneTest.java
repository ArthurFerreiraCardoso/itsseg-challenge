import exercises.ExerciseOne;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseOneTest {

    private final ExerciseOne exercise = new ExerciseOne();
    @Test
    public void testValidPangram() {
        String pangram = "The quick brown fox jumps over the lazy dog.";
        assertEquals(true, exercise.isPangram(pangram));
    }

    @Test
    public void testInvalidPangram() {
        String pangram = "Hello world!";
        assertEquals(false, exercise.isPangram(pangram));
    }

    @Test
    public void testValidPangramWithAnotherExample() {
        String pangram = "Pack my box with five dozen liquor jugs.";
        assertEquals(true, exercise.isPangram(pangram));
    }

    @Test
    public void testEmptySentence() {
        String pangram = "";
        assertEquals(false, exercise.isPangram(pangram));
    }

    @Test
    public void testNullInput() {
        String pangram = null;
        assertEquals(false, exercise.isPangram(pangram));
    }
}

