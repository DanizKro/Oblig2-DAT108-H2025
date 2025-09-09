package Oppg1;

public class Melding {

	String melding;

	public String getMelding() {
		return melding;
	}

	public void setMelding(String melding) {
		this.melding = melding;
	}

	public synchronized boolean harTekst() {
		return melding != null;
	}
}
