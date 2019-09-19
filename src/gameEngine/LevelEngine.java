package gameEngine;

import java.util.ArrayList;
import java.util.Arrays;

import levelPieces.GamePiece;
import levelPieces.MudPuddle;
import levelPieces.SpikePiece;
import levelPieces.UfoPiece;
import levelPieces.Boomerang;
import levelPieces.CoinPiece;
import levelPieces.FlagPole;

//Jerry Birnbaum and Zane Deaton

public class LevelEngine {
	
	private Drawable[] board;
	private ArrayList<GamePiece> interactPiece = new ArrayList<GamePiece>();
	private ArrayList<Moveable> movingPiece = new ArrayList<Moveable>();
	private int playerStart;
	public void createLevel(int level) {
		board = null;
		interactPiece.clear();
		movingPiece.clear();
		
		
		if(level == 1) {
			board = new Drawable[GameEngine.BOARD_SIZE];
			board[1] = new SpikePiece(1);
			interactPiece.add(new SpikePiece(1));
			playerStart = 0;
			Boomerang boomerangEnemy = new Boomerang(4);
			board[4] = boomerangEnemy;
			movingPiece.add(boomerangEnemy);
			interactPiece.add(boomerangEnemy);
			board[9] = new MudPuddle();
			UfoPiece ufoEnemy = new UfoPiece(15);
			board[15] =ufoEnemy;
			movingPiece.add(ufoEnemy);
			interactPiece.add(ufoEnemy); 
			FlagPole finish = new FlagPole(7);
			board[7] =finish;
			interactPiece.add(finish);
			CoinPiece point = new CoinPiece(19);
			board[19] =point;
			interactPiece.add(point);
		}
		if(level == 2) {
			board = new Drawable[GameEngine.BOARD_SIZE];
			UfoPiece ufoEnemy = new UfoPiece(4);
			board[4] =ufoEnemy;
			movingPiece.add(ufoEnemy);
			interactPiece.add(ufoEnemy); 
			UfoPiece ufoEnemy1 = new UfoPiece(5);
			board[5] =ufoEnemy1;
			movingPiece.add(ufoEnemy1);
			interactPiece.add(ufoEnemy1); 
			UfoPiece ufoEnemy2 = new UfoPiece(6);
			board[6] =ufoEnemy2;
			movingPiece.add(ufoEnemy2);
			interactPiece.add(ufoEnemy2); 
			UfoPiece ufoEnemy3 = new UfoPiece(7);
			board[7] =ufoEnemy3;
			movingPiece.add(ufoEnemy3);
			interactPiece.add(ufoEnemy3);
			FlagPole finish = new FlagPole(20);
			board[20] =finish;
			interactPiece.add(finish);
			playerStart = 0;
		}

	}

	public Drawable[] getBoard() {
		return board;
	}
	
	public ArrayList<Moveable> getMovingPieces() {
		return movingPiece;
	}
	
	public ArrayList<GamePiece> getInteractingPieces(){
		return interactPiece;
	}
	
	public int getPlayerStartLoc() {
		return playerStart;
	}
}
