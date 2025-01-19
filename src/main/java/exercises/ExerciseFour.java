package exercises;

import java.util.Optional;

/**
 * 4-Verificar se uma string termina com outra
 * Complete a solução para que ela retorne verdadeiro se o primeiro argumento (string)
 * passado terminar com o segundo argumento (também uma string).
 */

public class ExerciseFour {
    public boolean solution(String str1, String str2) {
        if (str2 == null) {
            return false;
        }
        return Optional.ofNullable(str1)
                .map(s -> s.endsWith(str2))
                .orElse(false);
    }
}
