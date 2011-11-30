// Source file: c:/dice/Persist/SrKit.java

package m2.dice.hs;


public class SrKit extends HighScoreFactory {

	@Override
	public HighScore createHighScore() {
		return new HighScoreSr();
	}
}
