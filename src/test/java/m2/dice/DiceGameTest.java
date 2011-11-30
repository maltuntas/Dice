/**
 * 
 */
package m2.dice;

import junit.framework.TestCase;
import m2.dice.dice.DieMock3;
import m2.dice.dice.DieMock4;
import m2.dice.dicegame.DiceGame;
import m2.dice.hs.HighScoreMock;
import m2.dice.player.Player;

/**
 * @author molli
 * 
 */
public class DiceGameTest extends TestCase {

	/**
	 * @param name
	 */
	public DiceGameTest(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link dicegame.DiceGame#play()}.
	 */
	public void testPlay() {
		DiceGame dg = new DiceGame(new HighScoreMock(), new DieMock3(),
				new DieMock4(), new Player("momo"));

		dg.play();

		assertEquals("turn =1", dg.turn, 1);
		assertEquals("Score=10", dg.getPlayer().getScore(), 10);
	}

	public void testHs() {
		DiceGame dg = new DiceGame(new HighScoreMock(), new DieMock3(),
				new DieMock4(), new Player("momo"));

		for (int i = 0; i < 10; i++) {
			dg.play();
		}
		assertEquals("turn =10", dg.turn, 10);
		
	}

}
