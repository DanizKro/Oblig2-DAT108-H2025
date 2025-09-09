package Oppg1;

public class Utskriftsloop extends Thread {

	private boolean fortsette = true;

	Melding melding;
	
	public Utskriftsloop(Melding melding) {
		this.melding = melding;
	}

	public void stopp() {
		fortsette = false;
	}

	@Override
	public void run() {

		while (!melding.harTekst()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

		while (fortsette) {
			System.out.println(melding.getMelding());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		}
	}
	
	
	

}
