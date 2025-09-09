package Oppg2;

import java.util.LinkedList;
import java.util.Queue;

public class HamburgerBrett {

	private final int kapasitet;
	private int burgerNr = 1;
	private Queue<Hamburger> ko = new LinkedList<>();

	public HamburgerBrett(int kap) {
		kapasitet = kap;
	}

	public synchronized void leggTilBurger(String kokkNavn) {
		
		while (isFull()) {
			System.out.println(kokkNavn + " (kokk) ønsker å legge på, men brett fullt. Venter!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Hamburger h = new Hamburger(burgerNr++);
		ko.add(h);
		System.out.println(kokkNavn + " (kokk) legger på hamburger " + h.toString() + ".   Brett: " + ko);
		notifyAll();
	}

	public synchronized void taBurger(String servitorNavn) {
		
		while (isEmpty()) {
			System.out.println(servitorNavn + " (servitør) ønsker å ta hamburger, men brett tomt. Venter!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Hamburger h = ko.remove();
		System.out.println(servitorNavn + " (servitør) tar av hamburger " + h.toString() + ".   Brett: " + ko);
		notifyAll();
	}

	public boolean isEmpty() {
		return ko.isEmpty();
	}

	public boolean isFull() {
		return ko.size() == kapasitet;
	}
}