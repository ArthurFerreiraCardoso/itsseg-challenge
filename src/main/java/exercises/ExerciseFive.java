package exercises;

import java.util.Arrays;
import java.util.stream.Collectors;

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
        if (sentence.isEmpty()) {
            return "";
        }
        return Arrays.stream(sentence.split("(?<=\\s)|(?=\\s)"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(""));
    }
}

