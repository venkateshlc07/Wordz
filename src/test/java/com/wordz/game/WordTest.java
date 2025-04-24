package com.wordz.game;



import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class WordTest {

	@Test
	public void oneIncorrectLetter(){
		var word = new Word("A");
		Score score = word.guess("C");
		var result = score.letter(0);

		assertThat(result).isEqualTo(Letter.INCORRECT);
	}

	@Test
	public void oneCorrectLetter(){
		var word = new Word("A");
		Score score = word.guess("A");

		var result = score.letter(0);
		assertThat(result).isEqualTo(Letter.CORRECT);
	}


}
