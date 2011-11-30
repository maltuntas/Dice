package m2.dice.dice;

import java.awt.Component;

import javax.swing.JLabel;

public class DieMock3 implements DieI {

	public Component display() {
		// TODO Auto-generated method stub
		return new JLabel("3 ;)");
	}

	public int getValue() {
		// TODO Auto-generated method stub
		return 3;
	}

	public int roll() {
		// TODO Auto-generated method stub
		return 3;
	}

}
