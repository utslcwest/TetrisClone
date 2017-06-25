package com.github.utslcwest.tetrisclone.model;

public class ScoreCounter {
	
	private int score;
	
	public ScoreCounter() {
		score = 0;
	}
	
	public int increaseScore(int points) {
		score += points;
		return score;
	}
	
	public int getScore() {
		return score;
	}

}
