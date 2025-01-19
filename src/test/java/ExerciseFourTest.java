import exercises.ExerciseFour;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseFourTest {

    private final ExerciseFour exercise = new ExerciseFour();

    @Test
    public void testStringEndsWithAnother() {
        String str1 = "abc";
        String str2 = "bc";
        assertTrue(exercise.solution(str1, str2));
    }

    @Test
    public void testStringDoesNotEndWithAnother() {
        String str1 = "abc";
        String str2 = "d";
        assertFalse(exercise.solution(str1, str2));
    }

    @Test
    public void testEmptyFirstString() {
        String str1 = "";
        String str2 = "abc";
        assertFalse(exercise.solution(str1, str2));
    }

    @Test
    public void testEmptySecondString() {
        String str1 = "abc";
        String str2 = "";
        assertTrue(exercise.solution(str1, str2));
    }

    @Test
    public void testNullFirstString() {
        String str1 = null;
        String str2 = "abc";
        assertFalse(exercise.solution(str1, str2));
    }

    @Test
    public void testNullSecondString() {
        String str1 = "abc";
        String str2 = null;
        assertFalse(exercise.solution(str1, str2));
    }
}

