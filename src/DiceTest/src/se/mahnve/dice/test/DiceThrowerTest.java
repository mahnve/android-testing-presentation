package se.mahnve.dice.test;

import se.mahnve.dice.DiceThrower;
import junit.framework.TestCase;

public class DiceThrowerTest extends TestCase {
	
	private DiceThrower diceThrower;

	public void testShouldBeValidThrow() {
		for(int i=1; i<100; i++) {
			if (diceThrower.rollDice() < 1) 
				fail("should not be less than zero");
			if (diceThrower.rollDice() > 6)
				fail("should not be greater than six");
			
		}
	}

	protected void setUp() {
		diceThrower = new DiceThrower();
	}

}
