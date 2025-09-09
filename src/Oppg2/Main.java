package Oppg2;

public class Main {
	
	public static void main(String[] args) {
		
		final String[] kokker = {"Anne", "Erik", "Knut"};
		final String[] servitorer = {"Mia", "Per"};
		final int KAPASITET = 4;
		
		skrivUtHeader(kokker, servitorer, KAPASITET);
		HamburgerBrett brett = new HamburgerBrett(KAPASITET);
		
		for (String navn : kokker) {
		new Kokk(brett, navn).start();
		}
		for (String navn : servitorer) {
		new Servitor(brett, navn).start();
		}
		
	}

	private static void skrivUtHeader(String[] kokker, String[] servitorer, int KAPASITET) {
		
		String k = "";
		String s = "";
		
		for(String e: kokker) {
			k += e + ",";
		}
		for(String i: servitorer) {
			s += i + ",";
		}
		
		System.out.println("I denne simuleringen har vi" + "\n" 
						+ "      " + kokker.length + " " + "[" + k + "]" + "\n"
						+ "      " + servitorer.length + " " + "[" + s + "]" + "\n" 
						+ "Kapasitet til brettet er " + KAPASITET + " hamburgere" + "\n"
						+ "Vi starter ...");
		
	}
	
	
	/* - Fremgangsmåte:
	 1. Lager et HamburgerBrett med kapasitet til variabel KAPASITET
	 2. Lager vi kokker basert på hvor mange navn det er i listen av kokker
	 3. Hver kokk lager en ny hambuger tilfeldig i tidsintervallet 2-6 sekunder OG putter det på Hamburgerbrettet
	 4. Lager vi servitører basert på hvor mnage navn det er i listen av servitører
	 5. Hver servitør sjekker tilfeldig om det er noen hamburgerer på brettet,
	    hvis det er tar de av en hamburger og venter random 2-6 sekunder før de sjekker på nytt
	 */

}
