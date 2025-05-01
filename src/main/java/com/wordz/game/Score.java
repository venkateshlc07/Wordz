package com.wordz.game;

public class Score {

    private final String correctWord;
    private Letter result = Letter.INCORRECT;
    private int position;

    public Score(String wordGuess) {
        this.correctWord = wordGuess;
    }

    public Letter letter(int position) {
        return result;
    }

    public void assess(String wordGuess) {
        if(isCorrectLetter(wordGuess))
            result = Letter.CORRECT;
        }


    private boolean isCorrectLetter(String wordGuess) {
        return correctWord.charAt(position) == wordGuess.charAt(position);
    }
    }

