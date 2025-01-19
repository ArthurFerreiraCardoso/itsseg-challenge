package exercises;

import java.util.Arrays;

/**
 * 3 - Encontrar o maior e o menor número em uma sequência
 * Há  uma sequência de números separados por espaços e deve retornar o maior e o menor número.
 */

public class ExerciseThree {
    public static String highAndLow(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return "";
        }
        int[] nums = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = Arrays.stream(nums).max().orElseThrow();
        int min = Arrays.stream(nums).min().orElseThrow();

        return max + " " + min;
    }
}
