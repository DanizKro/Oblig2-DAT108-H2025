package Oppg3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class HamburgerBrett {

	private final int kapasitet;
	private int burgerNr = 1;
	private BlockingQueue<Hamburger> ko; // spesiell klasse for å håntere hvilke tråd som får lov å jobbe


	public HamburgerBrett(int kapasitet) {
		this.kapasitet = kapasitet;
		this.ko = new LinkedBlockingQueue<>(kapasitet);
    }

    public void leggTilBurger(String kokkNavn) {
        try {
            Hamburger h = new Hamburger(burgerNr++);
            ko.put(h); // venter automatisk hvis fullt
            System.out.println(kokkNavn + " (kokk) legger på hamburger " + h + ". Brett: " + ko);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void taBurger(String servitorNavn) {
        try {
            Hamburger h = ko.take(); // venter automatisk om det er tomt
            System.out.println(servitorNavn + " (servitør) tar av hamburger " + h + ". Brett: " + ko);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


	public boolean isEmpty() {
		return ko.isEmpty();
	}

	public boolean isFull() {
		return ko.size() == kapasitet;
	}
}