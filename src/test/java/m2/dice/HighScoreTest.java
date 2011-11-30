package m2.dice;

import junit.framework.TestCase;
import m2.dice.hs.Entry;
import m2.dice.hs.HighScore;
import m2.dice.hs.HighScoreFactory;
import m2.dice.hs.HighScoreSr;
import m2.dice.hs.SrKit;

public class HighScoreTest extends TestCase {
	
	HighScoreFactory pk;
	HighScore hs;
	
	public void testAdd() {
		hs.add(new Entry("toto",100));
		hs.add(new Entry("titi",100));
		
		assertTrue(hs.getSize()==2);
		assertTrue(((Entry)hs.getElementAt(0)).getName().equals("toto"));
		assertTrue(((Entry)hs.getElementAt(0)).getScore()==100);
		assertTrue(((Entry)hs.getElementAt(1)).getName().equals("titi"));
		assertTrue(((Entry)hs.getElementAt(1)).getScore()==100);
	}

	public void testSaveLoad() {
		hs.add(new Entry("toto",100));
		hs.add(new Entry("titi",100));
		
		
		hs.save();
		hs.entries=null;
		hs.load();

		assertTrue(hs.getSize()==2);
		assertTrue(((Entry)hs.getElementAt(0)).getName().equals("toto"));
		assertTrue(((Entry)hs.getElementAt(0)).getScore()==100);
		assertTrue(((Entry)hs.getElementAt(1)).getName().equals("titi"));
		assertTrue(((Entry)hs.getElementAt(1)).getScore()==100);

	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		pk= new SrKit();
		hs=pk.createHighScore();
		System.out.println("setup");

		((HighScoreSr)hs).clearFile();
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		((HighScoreSr)hs).clearFile();

	}


}
