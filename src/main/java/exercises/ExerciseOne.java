package exercises;

import java.util.HashSet;
import java.util.Set;

/**
 * 1-Verificar se uma frase é pangramática
 * Dado um texto, determine se ele é pangramático ou não. Retorne True caso seja, e False caso contrário.
 * Desconsidere números e símbolos de pontuação na verificação.
 */
public class ExerciseOne {
    public boolean isPangram(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return false;
        }
        Set<Character> uniqueLetters = new HashSet<>();
        for (char character : sentence.toLowerCase().toCharArray()) {
            if (character >= 'a' && character <= 'z') {
                uniqueLetters.add(character);
                if (uniqueLetters.size() == 26) {
                    return true;
                }
            }
        }
        return false;
    }
}

