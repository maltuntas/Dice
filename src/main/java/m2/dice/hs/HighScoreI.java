package m2.dice.hs;

import java.awt.Component;

public interface HighScoreI {

	public abstract void add(Entry entry);

	public abstract Component display();

}