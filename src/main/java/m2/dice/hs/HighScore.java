// Source file: c:/dice/Core/HighScore.java

package m2.dice.hs;

import java.awt.Component;
import java.util.Vector;

import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public abstract class HighScore implements java.io.Serializable, ListModel, HighScoreI {

	public Vector<Entry> entries = new Vector<Entry>();
	protected Vector<ListDataListener> listeners = new Vector<ListDataListener>();

	/* (non-Javadoc)
	 * @see hs.HighScoreI#add(hs.Entry)
	 */
	public void add(Entry entry) {
		entries.addElement(entry);
		for (ListDataListener l : listeners) {
			l.intervalAdded(new ListDataEvent(this,
					ListDataEvent.INTERVAL_ADDED, entries.size() - 1, entries
							.size()));
		}
	}

	// Abstract product...
	public abstract void load();

	public abstract void save();

	/* (non-Javadoc)
	 * @see hs.HighScoreI#display()
	 */
	public Component display() {
		Component c = new JList(this);
		return c;
	}

	// From ListModel
	public Object getElementAt(int index) {
		return entries.elementAt(index);
	}

	public int getSize() {
		return entries.size();
	}

	public void addListDataListener(ListDataListener l) {
		listeners.add(l);
	}

	public void removeListDataListener(ListDataListener l) {
		listeners.remove(l);
	}
}
