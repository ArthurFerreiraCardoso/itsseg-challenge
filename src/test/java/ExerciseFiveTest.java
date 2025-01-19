import exercises.ExerciseFive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseFiveTest {
    @Test
    public void testReverseWordsInNormalSentence() {
        String input = "This is an example!";
        String expected = "sihT si na !elpmaxe";
        ExerciseFive exercise = new ExerciseFive();
        assertEquals(expected, exercise.reverseWords(input));
    }
    @Test
    public void testReverseWordsWithExtraSpaces() {
        String input = "double  spaces";
        String expected = "elbuod  secaps";
        ExerciseFive exercise = new ExerciseFive();
        assertEquals(expected, exercise.reverseWords(input));
    }
    @Test
    public void testReverseWordsWithEmptyString() {
        String input = "";
        String expected = "";
        ExerciseFive exercise = new ExerciseFive();
        assertEquals(expected, exercise.reverseWords(input));
    }
    @Test
    public void testReverseWordsWithNullInput() {
        String input = null;
        String expected = "";
        ExerciseFive exercise = new ExerciseFive();
        assertEquals(expected, exercise.reverseWords(input));
    }
    @Test
    public void testReverseWordsWithMultipleSpaces() {
        String input = "   ";
        String expected = "   ";
        ExerciseFive exercise = new ExerciseFive();
        assertEquals(expected, exercise.reverseWords(input));
    }
}

