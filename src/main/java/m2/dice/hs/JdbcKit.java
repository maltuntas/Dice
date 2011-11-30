// Source file: c:/dice/Persist/JdbcKit.java

package m2.dice.hs;

public class JdbcKit extends HighScoreFactory {

	@Override
	public HighScore createHighScore() {
		return new HighScoreJDBC();
	}
}
