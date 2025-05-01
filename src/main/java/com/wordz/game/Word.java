package com.wordz.game;

public class Word {
    private final String word;

    public Word(String correctrWord) {
        this.word = correctrWord;
    }

    public Score guess(String wordGuess) {
        
        var score = new Score(word);
        score.assess(wordGuess);
        return score;
    }
}
