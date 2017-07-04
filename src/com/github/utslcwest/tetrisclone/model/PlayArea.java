package com.github.utslcwest.tetrisclone.model;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayArea {

	private static final int MAX_X = 9, MAX_Y = 19;
	private static final int MIN_X = 0, MIN_Y = 0;
	private Piece activePiece;
	private Map<Point, Block> blocks;

	public PlayArea() {
		blocks = new HashMap<Point, Block>();
		for (int i = MIN_X; i <= MAX_X; i++) {
			for (int j = MIN_Y; j <= MAX_Y; j++) {
				Point point = new Point(i, j);
				blocks.put(point, new Block(Color.BLACK, point));
			}
		}
	}
	
	public boolean isCollision() {
		return isPieceStoppedByBlock() || isPieceAtBottom();
	}

	private boolean isPieceStoppedByBlock() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isPieceAtBottom() {
		List<Point> activePoints = activePiece.getPiecePosition();
		for (Point point : activePoints){
			
			if (point.y == MIN_Y){
				return true;
				
			}
			
		}
		
		return false;
	}
	
}
