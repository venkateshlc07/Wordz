package com.wordz.game;

import java.util.ArrayList;
import java.util.List;

public class Score {

    private final String correctWord;
    private Letter result = Letter.INCORRECT;
    private int position;
    private final List<Letter> results = new ArrayList<>();

    public Score(String wordGuess) {
        this.correctWord = wordGuess;
    }

    public Letter letter(int position) {
        return results.get(position);
    }

    public void assess(String wordGuess) {
        for (char current : wordGuess.toCharArray()){
            if(isCorrectLetter(current)) {
                results.add(Letter.CORRECT);
            }else if(occursInWord(current)){
                results.add(Letter.PART_CORRECT);
            }else{
                results.add(Letter.INCORRECT);
            }
            position++;
    }
}

    private boolean occursInWord(char current) {
        return correctWord.contains(String.valueOf(current));
    }


    private boolean isCorrectLetter(char charLetter) {
        return correctWord.charAt(position) == charLetter;
    }
    }

