package exercises;

import java.util.Arrays;

/**
 * 5-Inverter palavras em uma frase
 * Complete a função que aceita um parâmetro string e inverte cada palavra na string.
 * Todos os espaços na string devem ser mantidos.
 */

public class ExerciseFive {
    public String reverseWords(String sentence) {
        if (sentence == null) {
            return "";
        }
        return String.join(" ", Arrays.stream(sentence.split(" ", -1))
                .map(word -> new StringBuilder(word).reverse().toString())
                .toArray(String[]::new));
    }
}
