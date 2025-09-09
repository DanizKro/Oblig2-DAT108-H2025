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

/* - Fremgangsmåte
1. Meldingsboks - Joption som tar inn brukerinfo og oppdaterer melding
2. Utskriftsloop som starter å kjøre loop på det brukeren skrev inn når den ser at melding ikke er NULL
3. Hvis brukeren avslutter med "quit", metodekall til Utskriftsloop at den skal slutte å skrive ut
*/