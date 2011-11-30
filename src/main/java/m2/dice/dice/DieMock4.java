package m2.dice.dice;

import java.awt.Component;

import javax.swing.JLabel;

public class DieMock4 implements DieI {

	public Component display() {
		// TODO Auto-generated method stub
		return new JLabel("4 ;)");
	}

	public int getValue() {
		// TODO Auto-generated method stub
		return 4;
	}

	public int roll() {
		// TODO Auto-generated method stub
		return 4;
	}

}
