package com.github.utslcwest.tetristclone.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.utslcwest.tetrisclone.model.ScoreCounter;

public class ScoreCounterTest {
	
	private ScoreCounter counter;

	@Test
	public void testNewCounterHasScoreOfZero() {
		counter = new ScoreCounter();
		int expected = 0;
		int actual = counter.getScore();
		assertTrue(expected == actual);
	}
	
	@Test
	public void testAddFourToScore() {
		counter = new ScoreCounter();
		counter.increaseScore(4);
		int expected = 4;
		int actual = counter.getScore();
		assertTrue(expected == actual);
	}

}
