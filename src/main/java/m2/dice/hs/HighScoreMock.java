package m2.dice.hs;

import java.awt.Component;

import javax.swing.JLabel;

public class HighScoreMock implements HighScoreI {

	public void add(Entry entry) {
		System.out.println(entry.toString());
	}

	public Component display() {
		// TODO Auto-generated method stub
		return new JLabel("HighScore !!");
	}

}
