package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_answer_is_1234_given_1234(){
        //given
        String guessNumber="1234";
        String answer="1234";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
        String guessResult=guessNumberGame.guess(guessNumber);
        //should

        assertEquals("4A0B",guessResult);
    }

    @Test
    void should_return_2A2B_when_answer_is_1234_given_1243(){
        //given
        String guessNumber="1243";
        String answer="1234";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
        String guessResult=guessNumberGame.guess(guessNumber);
        //should
        assertEquals("2A2B",guessResult);
    }
}
