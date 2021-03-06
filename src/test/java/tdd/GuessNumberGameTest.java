package tdd;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

class GuessNumberGameTest {
    private static final String WRONG_INPUT_INPUT_AGAIN = "Wrong Input，Input again";
    private static final String ALL_CORRECT = "4A0B";
    private static final String SOME_CORRECT_POSITION_ALL_CORRECT_NUMBER = "2A2B";
    private static final String ALL_WRONG_POSITION = "0A4B";
    private static final String NONE_CORRECT_POSITION_SOME_CORRECT_NUMBER = "0A2B";
    private static final String SOME_CORRECT_POSITION_SOME_CORRECT_NUMBER = "1A1B";
    private static final String NONE_CORRECT = "0A0B";

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
        assertEquals(ALL_CORRECT,guessResult);
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
        assertEquals(SOME_CORRECT_POSITION_ALL_CORRECT_NUMBER,guessResult);
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
        assertEquals(ALL_WRONG_POSITION,guessResult);
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
        assertEquals(SOME_CORRECT_POSITION_SOME_CORRECT_NUMBER,guessResult);
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
        assertEquals(NONE_CORRECT_POSITION_SOME_CORRECT_NUMBER,guessResult);
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
        assertEquals(NONE_CORRECT,guessResult);
    }

    @Test
    void should_return_Wrong_Input_Input_again_when_answer_is_1234_given_1122(){
        //given
        String guessNumber="1122";
        AnswerGenerator answerGenerator= Mockito.mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);
        String guessResult=guessNumberGame.guess(guessNumber);
        //should
        assertEquals(WRONG_INPUT_INPUT_AGAIN,guessResult);
    }

    @Test
    void should_return_Wrong_Input_Input_again_when_answer_is_1234_given_112(){
        //given
        String guessNumber="112";
        AnswerGenerator answerGenerator= Mockito.mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);
        String guessResult=guessNumberGame.guess(guessNumber);
        //should
        assertEquals(WRONG_INPUT_INPUT_AGAIN,guessResult);
    }

    @Test
    void should_return_Wrong_Input_Input_again_when_answer_is_1234_given_12354(){
        //given
        String guessNumber="12354";
        AnswerGenerator answerGenerator= Mockito.mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);
        String guessResult=guessNumberGame.guess(guessNumber);
        //should
        assertEquals(WRONG_INPUT_INPUT_AGAIN,guessResult);
    }

    @Test
    void should_return_true_when_answer_is_designated_given_designated(){
        //given
        AnswerGenerator answerGenerator=new GuessAnswerGenerator();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);
        String answer = guessNumberGame.getGuessAnswer();
        //when

        String guessResult=guessNumberGame.guess(answer);
        //should
        assertEquals(ALL_CORRECT,guessResult);
    }
}
