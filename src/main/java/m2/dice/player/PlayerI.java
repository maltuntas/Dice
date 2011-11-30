package m2.dice.player;

import java.awt.Component;

public interface PlayerI {

	/**
	 @roseuid 3802FC0103DD
	 */
	public abstract Component display();

	public abstract String getName();

	public abstract int getScore();

	public abstract void setScore(int value);

}