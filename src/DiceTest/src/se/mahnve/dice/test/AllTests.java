package se.mahnve.dice.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for se.mahnve.dice.test");
		//$JUnit-BEGIN$
		suite.addTestSuite(DiceThrowerTest.class);
		suite.addTestSuite(DiceUnitTest.class);
		//$JUnit-END$
		return suite;
	}

}
