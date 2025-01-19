import exercises.ExerciseOne;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseOneTest {

    private String pangram;
    @Test
    public void testValidPangram() {
        String pangram = "The quick brown fox jumps over the lazy dog.";
        ExerciseOne exercise = new ExerciseOne();
        assertEquals(true, exercise.isPangram(pangram));
    }

    @Test
    public void testInvalidPangram() {
        String pangram = "Hello world!";
        ExerciseOne exercise = new ExerciseOne();
        assertEquals(false, exercise.isPangram(pangram));
    }

    @Test
    public void testValidPangramWithAnotherExample() {
        String pangram = "Pack my box with five dozen liquor jugs.";
        ExerciseOne exercise = new ExerciseOne();
        assertEquals(true, exercise.isPangram(pangram));
    }

    @Test
    public void testEmptySentence() {
        String pangram = "";
        ExerciseOne exercise = new ExerciseOne();
        assertEquals(false, exercise.isPangram(pangram));
    }

    @Test
    public void testNullInput() {
        String pangram = null;
        ExerciseOne exercise = new ExerciseOne();
        assertEquals(false, exercise.isPangram(pangram));
    }
}
