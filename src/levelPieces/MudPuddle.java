package levelPieces;

import gameEngine.Drawable;

//Jerry Birnbaum and Zane Deaton

public class MudPuddle implements Drawable{

	private char symbol;
	
	public MudPuddle(){
		symbol = '8';
	}
	
	@Override
	public void draw() {
		System.out.print(symbol);
		
	}

}
