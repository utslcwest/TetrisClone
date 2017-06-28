package com.github.utslcwest.tetrisclone.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

public enum PieceType {
	
	LINE (Color.GREEN, 0, 0, 0, 1, 0, 2, 0, 3), //
	FORWARD_L (new Color(255, 0, 255), 0, 0, 1, 0, 0, 1, 0, 2), //
	BACKWARD_L (Color.BLUE, 0, 0, 1, 0, 1, 1, 1, 2), //
	FORWARD_Z (Color.YELLOW, 1, 2, 1, 1, 0, 1, 0, 0), //
	BACKWARD_Z (Color.RED, 0, 2, 0, 1, 1, 1, 1, 0), //
	SQUARE (Color.ORANGE, 0, 0, 0, 1, 1, 0, 1, 1), //
	HALF_PLUS (Color.CYAN, 0, 0, 0, 1, 0, 2, 1, 1);
	
	private final Color color;
	private final int x1, x2, x3, x4, y1, y2, y3, y4;
	
	PieceType(Color color, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		this.color = color;
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
	}
	
	private Piece createPiece(PieceType type) {
		List<Block> blocks = Lists.newArrayList();
		Block pivoter;
		switch (type) {
		case LINE:
			blocks.add(new Block(LINE.color, new Position(LINE.x1, LINE.y1)));
			blocks.add(new Block(LINE.color, new Position(LINE.x2, LINE.y2)));
			blocks.add(new Block(LINE.color, new Position(LINE.x3, LINE.y3)));
			blocks.add(new Block(LINE.color, new Position(LINE.x4, LINE.y4)));
			pivoter = blocks.get(0);
			break;
		case FORWARD_L:
			blocks.add(new Block(FORWARD_L.color, new Position(FORWARD_L.x1, FORWARD_L.y1)));
			blocks.add(new Block(FORWARD_L.color, new Position(FORWARD_L.x2, FORWARD_L.y2)));
			blocks.add(new Block(FORWARD_L.color, new Position(FORWARD_L.x3, FORWARD_L.y3)));
			blocks.add(new Block(FORWARD_L.color, new Position(FORWARD_L.x4, FORWARD_L.y4)));
			pivoter = blocks.get(0);
			break;
		case BACKWARD_L:
			blocks.add(new Block(BACKWARD_L.color, new Position(BACKWARD_L.x1, BACKWARD_L.y1)));
			blocks.add(new Block(BACKWARD_L.color, new Position(BACKWARD_L.x2, BACKWARD_L.y2)));
			blocks.add(new Block(BACKWARD_L.color, new Position(BACKWARD_L.x3, BACKWARD_L.y3)));
			blocks.add(new Block(BACKWARD_L.color, new Position(BACKWARD_L.x4, BACKWARD_L.y4)));
			pivoter = blocks.get(0);
			break;
		case FORWARD_Z:
			blocks.add(new Block(FORWARD_Z.color, new Position(FORWARD_Z.x1, FORWARD_Z.y1)));
			blocks.add(new Block(FORWARD_Z.color, new Position(FORWARD_Z.x2, FORWARD_Z.y2)));
			blocks.add(new Block(FORWARD_Z.color, new Position(FORWARD_Z.x3, FORWARD_Z.y3)));
			blocks.add(new Block(FORWARD_Z.color, new Position(FORWARD_Z.x4, FORWARD_Z.y4)));
			pivoter = blocks.get(0);
			break;
		default:
			break;
		}
		return null;
	}

}
