package com.wordz.game;



import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class WordTest {

	@Test
	public void oneIncorrectLetter(){
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

	private void assertScoreForLetter(Score score, int position, Letter expected){
		assertThat(score.letter(position)).isEqualTo(expected);
	}


}
