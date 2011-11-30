package m2.dice;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests extends TestCase{

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for m2.dice");
		//$JUnit-BEGIN$
		suite.addTestSuite(HighScoreTest.class);
		suite.addTestSuite(DiceGameTest.class);
		suite.addTestSuite(MockGameTest.class);
		//$JUnit-END$
		return suite;
	}

}
