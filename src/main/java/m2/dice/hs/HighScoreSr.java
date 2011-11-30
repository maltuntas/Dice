// Source file: c:/dice/Persist/HighScoreSr.java

package m2.dice.hs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class HighScoreSr extends HighScore {
	/**
	 * Constance...
	 */
	private static String filename = "/tmp/high.score";

	
	/**
	 * @return true if highscore file is deleted...
	 * Used by tests...
	 */
	public boolean clearFile() {
		File f=new File(filename);
		return f.delete();
	}
	/**
	 * @roseuid 38044FD30185
	 */
	public void load() {
		ObjectInputStream q=null;
		try {
			FileInputStream istream = new FileInputStream(filename);
			q = new ObjectInputStream(istream);

			this.entries = (Vector<Entry>)q.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("No file:" + filename + " found");
		} catch (Exception e) {
			e.printStackTrace();
			new Error("Error while loading HighScore");
		} finally {
			if (q!=null) {try {
				q.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		}
	}

	/**
	 * @roseuid 38044FDB01A5
	 */
	public void save() {
		try {
			FileOutputStream ostream = new FileOutputStream(filename);
			ObjectOutputStream p = new ObjectOutputStream(ostream);

			p.writeObject(this.entries); // Write the tree to the stream.
			p.flush();
			p.close(); // close the file.
		} catch (Exception e) {
			e.printStackTrace();
			new Error("Error while Saving HighScore...");
		}
	}

	/**
	 * @roseuid 38074D930090
	 */
	public HighScoreSr() {
		load();
	}
}
