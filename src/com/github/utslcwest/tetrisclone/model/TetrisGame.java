package com.github.utslcwest.tetrisclone.model;

public class TetrisGame {
	
	private ScoreCounter counter;
	private PlayArea area;
	private Piece current, next;
	
	public TetrisGame () {
		counter = new ScoreCounter();
		area = new PlayArea();
		current = Piece.getRandomPiece();
		next = Piece.getRandomPiece();
	}
	
	public void tick() {
		boolean collision = checkForCollision();
	}

	private boolean checkForCollision() {
		return false;
	}

}
