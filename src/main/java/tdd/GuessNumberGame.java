package tdd;

public class GuessNumberGame {
    private String guessAnswer;

    public GuessNumberGame(String guessAnswer){
        this.guessAnswer=guessAnswer;
    }

    public String getGuessAnswer() {
        return guessAnswer;
    }

    public void setGuessAnswer(String guessAnswer) {
        this.guessAnswer = guessAnswer;
    }

    public String guess(String guessNumber){
        if(guessNumber.equals(guessAnswer)){
            return "4A0B";
        }
        return null;
    }
}
