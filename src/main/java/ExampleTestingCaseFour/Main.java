package ExampleTestingCaseFour;

import exercises.ExerciseFour;

public class Main {
    public static void main(String[] args) {
        ExerciseFour exercise = new ExerciseFour();
        // a saida deve ser true
        System.out.println(exercise.solution("hello", "lo"));
        // a saida deve ser false
        System.out.println(exercise.solution("hello", "world"));
        // a saida deve ser false
        System.out.println(exercise.solution("hello", null));
        // a saida deve ser false
        System.out.println(exercise.solution(null, "lo"));
    }
}

