package com.github.utslcwest.tetrisclone.model;

import java.awt.Color;
import java.awt.Point;
import java.util.List;
import java.util.Random;

import static com.google.common.collect.Lists.newArrayList;

public class Piece {

	public enum Type {

		I(Color.GREEN, I_COORDS), //
		L(new Color(255, 0, 255), L_COORDS), //
		J(Color.BLUE, J_COORDS), //
		Z(Color.YELLOW, Z_COORDS), //
		S(Color.RED, S_COORDS), //
		O(Color.ORANGE, O_COORDS), //
		T(Color.CYAN, T_COORDS);

		private final Color color;
		private final int[][] coords;

		Type(Color color, int[][] coords) {
			this.color = color;
			this.coords = coords;
		}

	}

	private static final int[][] I_COORDS = { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 0, 3 } };
	private static final int[][] L_COORDS = { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 0 } };
	private static final int[][] J_COORDS = { { 1, 0 }, { 1, 1 }, { 1, 2 }, { 0, 0 } };
	private static final int[][] Z_COORDS = { { 0, 0 }, { 0, 1 }, { 1, 1 }, { 1, 2 } };
	private static final int[][] S_COORDS = { { 1, 0 }, { 1, 1 }, { 0, 1 }, { 0, 2 } };
	private static final int[][] O_COORDS = { { 0, 0 }, { 0, 1 }, { 1, 1 }, { 1, 0 } };
	private static final int[][] T_COORDS = { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 1 } };

	private List<Block> blocks;
	private Block axle;

	public Piece(Type type) {
		this.blocks = Piece.createBlocks(type);
		this.axle = blocks.get(1);
	}

	private static List<Block> createBlocks(Type type) {
		List<Block> blocks = newArrayList();
		for (int[] coord : type.coords) {
			Block block = new Block(type.color, new Point(coord[0], coord[1]));
			blocks.add(block);
		}
		return blocks;
	}

	public static Piece getRandomPiece() {
		return new Piece(Type.values()[new Random().nextInt(Type.values().length)]);
	}

	public List<Point> getPiecePosition() {
		List<Point> points = newArrayList();
		for (int i = 0; i <= 3; i++) {
			points.add(blocks.get(i).point);
		}
		return points;
	}

	public void moveLeft() {
		for (Block block : blocks) {
			block.point.translate(-1, 0);
		}
	}

	public void moveRight() {
		for (Block block : blocks) {
			block.point.translate(+1, 0);
		}
	}

}
