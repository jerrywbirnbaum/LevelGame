package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

//Jerry Birnbaum and Zane Deaton

public class CoinPiece extends GamePiece implements Drawable {

	public CoinPiece(int location) {
		super('o', location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(playerLocation == this.getLocation()) {
			return InteractionResult.GET_POINT;
		}
		return null;
	}

}