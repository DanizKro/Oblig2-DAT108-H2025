package Oppg3;

public class Hamburger {
	
	private int nr;
	
	public Hamburger(int nr) {
		this.nr = nr;
	}
	
	public int getNummer() {
		return nr;
	}
	
	@Override
    public String toString() {
        return "◖" + nr + "◗";
    }
}
