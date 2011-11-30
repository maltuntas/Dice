// Source file: c:/dice/Core/Die.java

package m2.dice.dice;

import java.awt.Component;
import java.util.Observable;
import java.util.Observer;

import m2.dice.Util.Randomizer;

public class Die extends Observable implements DieI {
	private int faceValue = 1;

	/* (non-Javadoc)
	 * @see dice.DieI#roll()
	 */
	public int roll() {
		setValue(Randomizer.getInstance().getValue());
		return getValue();
	}

	/**
	 * @roseuid 37F877590087
	 */
	public Die() {
	}

	/* (non-Javadoc)
	 * @see dice.DieI#display()
	 */
	public java.awt.Component display() {
		Component c = new DieView(this);
		this.addObserver((Observer) c);
		return c;
	}

	/**
	 * @roseuid 3806E272026C
	 */
	public void setValue(int value) {
		faceValue = value;
		this.setChanged();
		this.notifyObservers();
	}

	/* (non-Javadoc)
	 * @see dice.DieI#getValue()
	 */
	public int getValue() {
		return faceValue;
	}
}
