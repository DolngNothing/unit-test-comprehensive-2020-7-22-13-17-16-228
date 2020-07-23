package tdd;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> guessList = convertIntoList(guessNumber);
        List<Integer> answerList = convertIntoList(this.guessAnswer);

        if(isNumberRepeat(guessList)) return "Wrong Input，Input again";


        Integer existNumber = countExistNumber(guessList,answerList);
        Integer rightPosition = countRightPosition(guessList,answerList);

        String result = (rightPosition)+"A"+(existNumber-rightPosition)+"B";

        return result;
    }

    public List<Integer> convertIntoList(String number){
        List<Integer> numbers=new ArrayList<Integer>();
        char[] numberArray= number.toCharArray();
        for(char numberChar:numberArray){
            numbers.add(numberChar-'0');
        }
        return numbers;
    }

    public Integer countExistNumber(List<Integer> guessList,List<Integer> answerList){
        Integer count=0;
        for(Integer guessNum:guessList){
            if(answerList.contains(guessNum)){
                count++;
            }
        }
        return count;
    }

    public Integer countRightPosition(List<Integer> guessList,List<Integer> answerList){
        Integer count=0;
        for(int i=0;i<guessList.size();i++){
            if(guessList.get(i)==answerList.get(i)){
                count++;
            }
        }
        return count;
    }

    public Boolean isNumberRepeat(List<Integer> guessList){
        long count = guessList.stream().distinct().count();
        boolean isRepeat = count < guessList.size();
        return isRepeat;
    }
}
