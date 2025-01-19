import exercises.ExerciseFour;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseFourTest {
    @Test
    public void testStringEndsWithAnother() {
        String str1 = "abc";
        String str2 = "bc";
        ExerciseFour exercise = new ExerciseFour();
        assertEquals(true, exercise.solution(str1, str2));
    }
    @Test
    public void testStringDoesNotEndWithAnother() {
        String str1 = "abc";
        String str2 = "d";
        ExerciseFour exercise = new ExerciseFour();
        assertEquals(false, exercise.solution(str1, str2));
    }
    @Test
    public void testEmptyFirstString() {
        String str1 = "";
        String str2 = "abc";
        ExerciseFour exercise = new ExerciseFour();
        assertEquals(false, exercise.solution(str1, str2));
    }
    @Test
    public void testEmptySecondString() {
        String str1 = "abc";
        String str2 = "";
        ExerciseFour exercise = new ExerciseFour();
        assertEquals(true, exercise.solution(str1, str2));
    }
    @Test
    public void testNullFirstString() {
        String str1 = null;
        String str2 = "abc";
        ExerciseFour exercise = new ExerciseFour();
        assertEquals(false, exercise.solution(str1, str2));
    }
    @Test
    public void testNullSecondString() {
        String str1 = "abc";
        String str2 = null;
        ExerciseFour exercise = new ExerciseFour();
        assertEquals(false, exercise.solution(str1, str2));
    }
}
