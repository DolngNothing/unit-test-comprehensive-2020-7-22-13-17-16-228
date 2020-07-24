package tdd;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

public class GuessNumberGameTest {
    String answer="1234";
    @Test
    void should_return_4A0B_when_answer_is_1234_given_1234(){
        //given
        String guessNumber="1234";
        AnswerGenerator answerGenerator= Mockito.mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);
        String guessResult=guessNumberGame.guess(guessNumber);
        //should
        assertEquals("4A0B",guessResult);
    }

    @Test
    void should_return_2A2B_when_answer_is_1234_given_1243(){
        //given
        String guessNumber="1243";
        AnswerGenerator answerGenerator= Mockito.mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);
        String guessResult=guessNumberGame.guess(guessNumber);
        //should
        assertEquals("2A2B",guessResult);
    }

    @Test
    void should_return_0A4B_when_answer_is_1234_given_4321(){
        //given
        String guessNumber="4321";
        AnswerGenerator answerGenerator= Mockito.mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);
        String guessResult=guessNumberGame.guess(guessNumber);
        //should
        assertEquals("0A4B",guessResult);
    }

    @Test
    void should_return_1A1B_when_answer_is_1234_given_1025(){
        //given
        String guessNumber="1025";
        AnswerGenerator answerGenerator= Mockito.mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);
        String guessResult=guessNumberGame.guess(guessNumber);
        //should
        assertEquals("1A1B",guessResult);
    }

    @Test
    void should_return_0A2B_when_answer_is_1234_given_2107(){
        //given
        String guessNumber="2107";
        AnswerGenerator answerGenerator= Mockito.mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);
        String guessResult=guessNumberGame.guess(guessNumber);
        //should
        assertEquals("0A2B",guessResult);
    }

    @Test
    void should_return_0A0B_when_answer_is_1234_given_5678(){
        //given
        String guessNumber="5678";
        AnswerGenerator answerGenerator= Mockito.mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);
        String guessResult=guessNumberGame.guess(guessNumber);
        //should
        assertEquals("0A0B",guessResult);
    }
}
