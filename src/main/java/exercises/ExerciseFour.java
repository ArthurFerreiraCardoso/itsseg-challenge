package exercises;

/**
 * 4-Verificar se uma string termina com outra
 * Complete a solução para que ela retorne verdadeiro se o primeiro argumento (string)
 * passado terminar com o segundo argumento (também uma string).
 */

public class ExerciseFour {
    public boolean solution(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        return str1.endsWith(str2);
    }
}

