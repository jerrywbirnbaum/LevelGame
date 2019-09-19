package levelPieces;


import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

//Jerry Birnbaum and Zane Deaton

public class Boomerang extends GamePiece implements Moveable {

	private boolean moveRight;
	
	public Boomerang(int location) {
		super('^', location);
		moveRight = true;
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(playerLocation + 1 == this.getLocation() || playerLocation - 1 == this.getLocation()) {
			return InteractionResult.HIT;
		}
		return null;
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		if(this.getLocation() + 2 < GameEngine.BOARD_SIZE && moveRight && gameBoard[this.getLocation() + 2] == null) {
			gameBoard[this.getLocation()] = null;
			gameBoard[this.getLocation() + 2] = this;
			this.setLocation(this.getLocation() + 2);
		}
		else if(this.getLocation() + 2 >= GameEngine.BOARD_SIZE && moveRight && gameBoard[this.getLocation() - 2] == null) {
			moveRight = false;
			gameBoard[this.getLocation()] = null;
			gameBoard[this.getLocation() - 2] = this;
			this.setLocation(this.getLocation() - 2);
		}
		else if(this.getLocation() - 2 >= 0 && !moveRight && gameBoard[this.getLocation() - 2] == null) {
			gameBoard[this.getLocation()] = null;
			gameBoard[this.getLocation() -2] = this;
			this.setLocation(this.getLocation() - 2);
			
		}
		else if(this.getLocation() - 2 < 0 && !moveRight && gameBoard[this.getLocation() + 2] == null) {
			moveRight = true;
			gameBoard[this.getLocation()] = null;
			gameBoard[this.getLocation() + 2] = this;
			this.setLocation(this.getLocation() + 2);
		}
	}


}