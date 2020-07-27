package tdd;

import java.util.ArrayList;
import java.util.List;

public class GuessNumberGame {
    private String guessAnswer;

    public GuessNumberGame(AnswerGenerator answerGenerator){
        this.guessAnswer=answerGenerator.generate();
    }

    public String guess(String guessNumber){
        List<Integer> guessList = convertIntoList(guessNumber);
        List<Integer> answerList = convertIntoList(this.guessAnswer);

        if(isNumberRepeatOrless(guessList)) return "Wrong Input，Input again";

        Integer existNumber = countExistNumber(guessList,answerList);
        Integer rightPosition = countRightPosition(guessList,answerList);

        return (rightPosition)+"A"+(existNumber-rightPosition)+"B";
    }

    private List<Integer> convertIntoList(String number){
        List<Integer> numbers=new ArrayList<Integer>();
        char[] numberArray= number.toCharArray();
        for(char numberChar:numberArray){
            numbers.add(numberChar-'0');
        }
        return numbers;
    }

    private Integer countExistNumber(List<Integer> guessList, List<Integer> answerList){
        Integer count=0;
        for(Integer guessNum:guessList){
            if(answerList.contains(guessNum)){
                count++;
            }
        }
        return count;
    }

    private Integer countRightPosition(List<Integer> guessList, List<Integer> answerList){
        Integer count=0;
        for(int i=0;i<guessList.size();i++){
            if(guessList.get(i).equals(answerList.get(i))){
                count++;
            }
        }
        return count;
    }

    private Boolean isNumberRepeatOrless(List<Integer> guessList){
        long count = guessList.stream().distinct().count();
        return count < guessList.size();
    }

}
