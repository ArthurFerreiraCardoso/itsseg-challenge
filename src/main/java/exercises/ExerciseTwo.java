package exercises;

import java.util.HashSet;
import java.util.Set;

/**
 * 2 -Remover vogais de comentários ofensivos
 * Por exemplo, ao processar a frase "This website is for losers LOL!", o resultado seria "sts st pr prdrs LL!".
 */

public class ExerciseTwo {
    public static String disemvowel(String text) {
        if (text == null) {
            return "";
        }
        Set<Character> vowels = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (!vowels.contains(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
