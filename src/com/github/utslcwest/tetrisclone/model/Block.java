package com.github.utslcwest.tetrisclone.model;

import java.awt.Color;

public class Block {

	private Color color;

	private Position position;

	public Block(Color color, Position position) {
		this.color = color;
		this.position = position;

	}

	public void setPosition(Position position) {
		this.position = position;

	}

	public Position getPosition() {
		return position;

	}

	public Color getColor() {
		return color;
	}

}
