// Source file: c:/dice/Core/Player.java

package m2.dice.player;

import java.awt.Component;
import java.util.Observable;
import java.util.Observer;

public class Player extends Observable implements PlayerI {
	private String name;

	private int score = 0;

	/**
	 * @roseuid 37F878B80208
	 */
	public Player(String name) {
		this.name = name;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see player.PlayerI#display()
	 */
	public Component display() {
		Component c = new PlayerView(this);
		this.addObserver((Observer) c);
		return c;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see player.PlayerI#getName()
	 */
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see player.PlayerI#getScore()
	 */
	public int getScore() {
		return score;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see player.PlayerI#setScore(int)
	 */
	public void setScore(int value) {
		score = value;
		this.setChanged();
		this.notifyObservers();
	}


	public void setName(String text) {
		this.setName(text);
		this.setChanged();
		this.notifyObservers();
	}
}
