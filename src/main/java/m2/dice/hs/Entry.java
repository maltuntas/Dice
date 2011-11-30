// Source file: c:/dice/Core/Entry.java

package m2.dice.hs;

import java.io.Serializable;

public class Entry implements Serializable {
    private String  name;
    private int score;
    
    /**
       @roseuid 3801A33002D0
     */
    public Entry(String name,int score) {
	this.name=name;
	this.score=score;
    }
    
    public String getName() {
	return name;
    }
    
    public int getScore() {
	return score;
    }

    public String toString() {
	return getName()+","+getScore();
    }
}
