package com.github.utslcwest.tetrisclone.model;

import java.util.List;

public class Piece {
	
	private List<Block> blocks;
	private Block pivoter;
	
	public Piece(List<Block> blocks, Block pivoter) {
		this.blocks = blocks;
		this.pivoter = pivoter;
	}

}
