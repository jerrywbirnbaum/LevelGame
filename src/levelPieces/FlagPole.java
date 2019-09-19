package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

//Jerry Birnbaum and Zane Deaton

public class FlagPole extends GamePiece implements Drawable {

	public FlagPole(int location) {
		super('$', location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(playerLocation == this.getLocation()) {
			return InteractionResult.ADVANCE;
		}
		return null;
	}

}
