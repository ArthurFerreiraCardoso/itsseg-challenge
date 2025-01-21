import exercises.ExerciseOne;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseOneTest {

    private final ExerciseOne exercise = new ExerciseOne();

    @Test
    public void testValidPangram() {
        String pangram = "The quick brown fox jumps over the lazy dog.";
        assertTrue(exercise.isPangram(pangram));
    }

    @Test
    public void testInvalidPangram() {
        String pangram = "Hello world!";
        assertFalse(exercise.isPangram(pangram));
    }

    @Test
    public void testValidPangramWithAnotherExample() {
        String pangram = "Pack my box with five dozen liquor jugs.";
        assertTrue(exercise.isPangram(pangram));
    }

    @Test
    public void testEmptySentence() {
        String pangram = "";
        assertFalse(exercise.isPangram(pangram));
    }

    @Test
    public void testNullInput() {
        String pangram = null;
        assertFalse(exercise.isPangram(pangram));
    }

    @Test
    public void testPangramWithSpecialCharacters() {
        String pangram = "@#!$123A quick brown fox jumps over the lazy dog!!!";
        assertTrue(exercise.isPangram(pangram));
    }

    @Test
    public void testPangramWithRedundantLetters() {
        String pangram = "Aaa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz.";
        assertTrue(exercise.isPangram(pangram));
    }

    // nao contem todas as letras
    @Test
    public void testLongTextWithoutAllLetters() {
        String pangram = "This is a very long text that surprisingly does not contain every single letter of the alphabet.";
        assertFalse(exercise.isPangram(pangram));
    }

    @Test
    public void testValidPangramWithMixedSpacing() {
        String pangram = "The quick   brown    fox     jumps   over the   lazy  dog";
        assertTrue(exercise.isPangram(pangram));
    }

    @Test
    public void testPangramWithMixedCase() {
        String pangram = "ThE QuiCk BroWn FoX JuMpS OvEr ThE LaZy DoG";
        assertTrue(exercise.isPangram(pangram));
    }
}

