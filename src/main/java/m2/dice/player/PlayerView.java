// Source file: c:/dice/UI/PlayerView.java

package m2.dice.player;

import java.awt.Label;
import java.awt.Panel;
import java.util.Observable;
import java.util.Observer;



public class PlayerView extends Panel implements Observer {
    private Label nameLabel;
    private Label scoreLabel;

    /**
       @roseuid 3802FC5C030B
     */
    public PlayerView(Player player) {
	this.add(nameLabel=new Label("Name:"+player.getName()));
	this.add(scoreLabel=new Label("Score:"+player.getScore()));
		 
    }
    
    /**
       @roseuid 38033290003D
     */
    public void update(Observable o, Object arg) {
	scoreLabel.setText("Score:"+((PlayerI)o).getScore());
    }
    
}
