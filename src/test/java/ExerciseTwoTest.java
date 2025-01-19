import exercises.ExerciseTwo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseTwoTest {

    @Test
    public void testRemoveVowelsFromOffensiveComment() {
        assertEquals("Ths wbst s fr lsrs LL!", ExerciseTwo.disemvowel("This website is for losers LOL!"));
        assertEquals("N ffns bt, Yr wrtng s mng th wrst 'v vr rd", ExerciseTwo.disemvowel("No offense but, Your writing is among the worst I've ever read"));
        assertEquals("Wht r y,  cmmnst?", ExerciseTwo.disemvowel("What are you, a communist?"));
    }
    @Test
    public void testEmptyAndNullInput() {
        assertEquals("", ExerciseTwo.disemvowel(""));
        assertEquals("", ExerciseTwo.disemvowel(null));
    }
}
