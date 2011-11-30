// Source file: c:/dice/UI/PlayerForm.java

package m2.dice.player;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PlayerForm extends Frame implements ActionListener {

	private Button ok = new Button("Ok");
	private TextField tf = new TextField("Momo");
	private Button cancel = new Button("Cancel");
	private Player p;
	
	
	PlayerForm(Player p) {
		this.p=p;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok) {
			okAction();
		}
		if (e.getSource() == cancel) {
			cancelAction();
		}
		if (e.getSource() == tf) {
			okAction();
		}
	}

	public void okAction() {
		this.setVisible(false);
		p.setName(tf.getText());
	}

	public void cancelAction() {
		this.setVisible(false);
	}

	public PlayerForm() {
		this.setLayout(new BorderLayout());
		this.add("Center", tf);
		Panel south = new Panel();
		south.add(ok);
		ok.addActionListener(this);
		south.add(cancel);
		cancel.addActionListener(this);
		this.add("South", south);
	}
}
