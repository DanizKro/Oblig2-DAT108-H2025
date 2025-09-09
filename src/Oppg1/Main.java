package Oppg1;

public class Main {

	public static void main(String[] args) {
		
		Melding m = new Melding();
		
		Utskriftsloop loop = new Utskriftsloop(m);
		Meldingsboks melding = new Meldingsboks(m, loop);
		

		loop.start();
		melding.start();
	}

}


/*
1. Joption som tar inn brukerinfo
2. Thread som starter å kjøre loop på det brukeren skrev inn
3. hvis brukeren avslutter, sender signal til Thread at den skal slutte å skrive ut
*/