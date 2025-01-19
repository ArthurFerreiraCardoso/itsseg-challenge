package exercises;

import java.util.stream.IntStream;

public class ExerciseSix {
    public int closeInSum(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int length = numStr.length();
        int sum = IntStream.range(0, length / 2)
                .map(i -> {
                    int firstDigit = numStr.charAt(i) - '0';
                    int lastDigit = numStr.charAt(length - i - 1) - '0';
                    return firstDigit * 10 + lastDigit;
                })
                .sum();
        if (length % 2 != 0) {
            sum += numStr.charAt(length / 2) - '0';
        }
        return sum;
    }
}
