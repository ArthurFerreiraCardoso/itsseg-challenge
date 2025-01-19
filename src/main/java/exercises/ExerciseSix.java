package exercises;


public class ExerciseSix {
    public int closeInSum(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int length = numStr.length();
        int sum = 0;

        for (int i = 0; i < length / 2; i++) {
            int firstDigit = numStr.charAt(i) - '0';
            int lastDigit = numStr.charAt(length - i - 1) - '0';
            sum += firstDigit * 10 + lastDigit;
        }
        if (length % 2 != 0) {
            sum += numStr.charAt(length / 2) - '0';
        }
        return sum;
    }
}

