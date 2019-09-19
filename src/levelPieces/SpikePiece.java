package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

//Jerry Birnbaum and Zane Deaton

public class SpikePiece extends GamePiece implements Drawable{

	public SpikePiece(int location) {
		super('#', location);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(playerLocation == this.getLocation()) {
			return InteractionResult.KILL;
		}
		return null;
	}
}
