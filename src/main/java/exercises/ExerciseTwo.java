package exercises;

import java.util.Optional;

/** 2 -Remover vogais de comentários ofensivos
 Por exemplo, ao processar a frase "This website is for losers LOL!", o resultado seria "sts st pr prdrs LL!". */

public class ExerciseTwo {
    public static String disemvowel(String text) {
        return Optional.ofNullable(text)
                .map(t -> t.replaceAll("(?i)[aeiou]", ""))
                .orElse("");
    }
}