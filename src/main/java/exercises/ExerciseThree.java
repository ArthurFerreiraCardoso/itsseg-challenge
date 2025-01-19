package exercises;

import java.util.Arrays;
import java.util.Optional;

/** 3 - Encontrar o maior e o menor número em uma sequência
 * Há  uma sequência de números separados por espaços e deve retornar o maior e o menor número.*/

public class ExerciseThree {
    public static String highAndLow(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return "";
        }
        Optional<Integer> max = Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .max(Integer::compare);

        Optional<Integer> min = Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .min(Integer::compare);

        return max.flatMap(m -> min.map(n -> m + " " + n)).orElse("");
    }
}
