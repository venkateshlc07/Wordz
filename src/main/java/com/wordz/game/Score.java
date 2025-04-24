package com.wordz.game;

public class Score {

    private final String correctWord;
    private Letter result = Letter.INCORRECT;

    public Score(String wordGuess) {
        this.correctWord = wordGuess;
    }

    public Letter letter(int position) {
        return result;
    }

    public void assess(int position, String wordGuess) {
        if(correctWord.charAt(position) == wordGuess.charAt(position)){
            result = Letter.CORRECT;
        }
    }
}
