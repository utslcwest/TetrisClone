package com.github.utslcwest.tetrisclone.model;

import java.awt.Color;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class PlayArea {
	
	private static final int MAX_X = 9, MAX_Y = 19;
	private static final int MIN_X = 0, MIN_Y = 0;
	private Piece activePiece;
	private List<Block> blocks;
	
	public PlayArea() {
		blocks = newArrayList();
		
	}

}
