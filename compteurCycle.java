package td;

public class compteurCycle extends compteur {
    public static final int MAX = 4;
	private int courant;

    public compteurCycle() {
        super(); 
    }

    public void incrementer() {
        if (this.courant == MAX) {
        } else {
            this.courant++; 
        }
    }
}
