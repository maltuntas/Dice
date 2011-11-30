// Source file: c:/dice/UI/DieView.java

package m2.dice.dice;

import java.awt.*;
import java.util.*;

public class DieView extends Panel implements Observer {

	private Label l;

	/**
	 * @roseuid 3802FD09010C
	 */
	public DieView(DieI die) {
		this.add(l = new Label("Die:" + die.getValue()));
	}

	/**
	 * @roseuid 3811D44701E6
	 */
	public void update(Observable o, Object arg) {
		l.setText("Die:" + ((DieI) o).getValue());
	}

}
