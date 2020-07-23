package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_guess_is_1234_given_1234(){
        //given
        String guessNumber="1234";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        String guessResult=guessNumberGame.guess(guessNumber);
        //should

        assertEquals("4A0B",guessResult);
    }
}
