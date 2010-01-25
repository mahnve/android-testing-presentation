package se.mahnve.dice;

import java.util.Random;

public class DiceThrower {
	
	public int rollDice() {
		return new Random().nextInt(5)+1;
	}
}
