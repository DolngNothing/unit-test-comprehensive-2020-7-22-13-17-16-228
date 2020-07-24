package tdd;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class GuessAnswerGenerator implements AnswerGenerator {

    @Override
    public String generate() {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int num = 0; num < 10; num++) {
            numbers.add(num);
        }
        StringBuilder answer = new StringBuilder();
        while (answer.length() < 4) {
            int random = new Random().nextInt(numbers.size());
            answer.append(numbers.get(random));
            numbers.remove(numbers.get(random));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        GuessAnswerGenerator guessAnswerGenerator = new GuessAnswerGenerator();
        for (int i = 0; i < 10; i++) {
            System.out.println(guessAnswerGenerator.generate());
        }
    }
}
