package levelPieces;


import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import java.util.concurrent.ThreadLocalRandom;

//Jerry Birnbaum and Zane Deaton

public class UfoPiece extends GamePiece implements Moveable {
	
	public UfoPiece(int location) {
		super('@', location);

	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(playerLocation + 2 == this.getLocation() || playerLocation - 2 == this.getLocation()) {
			return InteractionResult.KILL;
		}
		return null;
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int rand = ThreadLocalRandom.current().nextInt() % GameEngine.BOARD_SIZE;
		while(true) {
			rand = ThreadLocalRandom.current().nextInt() % GameEngine.BOARD_SIZE;
			if(rand >=0 && gameBoard[rand] == null) {
				gameBoard[this.getLocation()] = null;
				gameBoard[rand] = this;
				this.setLocation(rand);
				break;
			}
		}
	}


}