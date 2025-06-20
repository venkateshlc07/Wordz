package com.wordz.domain;

import java.util.ArrayList;
import java.util.List;

public class Score {

    private final String correctWord;
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
            results.add(scoreFor(current));
            position++;
        }
    }

    private Letter scoreFor(char current){
        if(isCorrectLetter(current))
            return Letter.CORRECT;
        if(occursInWord(current))
            return Letter.PART_CORRECT;
        return Letter.INCORRECT;
    }

    private boolean occursInWord(char current) {
        return correctWord.contains(String.valueOf(current));
    }

    private boolean isCorrectLetter(char charLetter) {
        return correctWord.charAt(position) == charLetter;
    }
}

