package Oppg1;

import javax.swing.JOptionPane;

public class Meldingsboks extends Thread {
	
	Melding melding;
	
	Utskriftsloop loop;
	
	public Meldingsboks(Melding melding, Utskriftsloop l) {
		this.melding = melding;
		this.loop = l;
		
	}
	
	@Override
	public void run() {
		
		String nyTekst = JOptionPane.showInputDialog("Skriv inn tekst:" + "\n" + "Skriv > quit < for å stoppe");
		
		while(!nyTekst.contentEquals("quit")) {
			melding.setMelding(nyTekst);
			
			nyTekst = JOptionPane.showInputDialog("Skriv inn tekst:" + "\n" + "Skriv > quit < for å stoppe");
		}
		
		loop.stopp();
		
	}

}
