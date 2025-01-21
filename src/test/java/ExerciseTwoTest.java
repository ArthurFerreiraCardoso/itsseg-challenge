import exercises.ExerciseTwo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseTwoTest {

    @Test
    public void testDisemvowelWithOffensiveComment() {
        assertEquals("Ths wbst s fr lsrs LL!", ExerciseTwo.removingVowel("This website is for losers LOL!"));
        assertEquals("N ffns bt, Yr wrtng s mng th wrst 'v vr rd", ExerciseTwo.removingVowel("No offense but, Your writing is among the worst I've ever read"));
        assertEquals("Wht r y,  cmmnst?", ExerciseTwo.removingVowel("What are you, a communist?"));
    }

    @Test
    public void testEmptyAndNullInput() {
        assertEquals("", ExerciseTwo.removingVowel(""));
        assertEquals("", ExerciseTwo.removingVowel(null));
    }

    @Test
    public void testNoVowels() {
        assertEquals("Ths", ExerciseTwo.removingVowel("This"));
        assertEquals("bcd", ExerciseTwo.removingVowel("bcd"));
    }

    @Test
    public void testOnlyVowels() {
        assertEquals("", ExerciseTwo.removingVowel("aeiouAEIOU"));
    }

    @Test
    public void testSpecialCharacters() {
        assertEquals("!@# 12345", ExerciseTwo.removingVowel("!@# 12345"));
    }

    @Test
    public void testSentenceWithPunctuation() {
        assertEquals("Ths s fntstc!!", ExerciseTwo.removingVowel("This is fantastic!!"));
    }
}

