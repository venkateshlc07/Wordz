package com.wordz.game;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class WordTest {

	@Test
	public void oneInCorrectLetter(){
		var word = new Word("A");
		Score score = word.guess("C");

		assertScoreForLetter(score,0, Letter.INCORRECT);
	}

	@Test
	public void oneCorrectLetter(){
		var word = new Word("A");
		Score score = word.guess("A");

		assertScoreForLetter(score,0, Letter.CORRECT);
	}

	@Test
    public void secondLetterWrongPosition(){
		var word = new Word("AR");
		var score = word.guess("ZA");
		assertScoreForLetter(score, 1, Letter.PART_CORRECT);
	}

	@Test
	public void allScoreCombinations(){
		var word = new Word("ARI");
		var score = word.guess("ZAI");
		assertScoreForLetter(score, 0, Letter.INCORRECT);
		assertScoreForLetter(score, 1, Letter.PART_CORRECT);
		assertScoreForLetter(score, 2, Letter.CORRECT);
	}


	private void assertScoreForLetter(Score score, int position, Letter expected){
		assertThat(score.letter(position)).isEqualTo(expected);
	}

}
