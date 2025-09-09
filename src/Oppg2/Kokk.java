package Oppg2;

import java.util.Random;

public class Kokk extends Thread {
	
    private HamburgerBrett brett;
    private String navn;
    private Random random = new Random();

    public Kokk(HamburgerBrett b, String navn) {
        this.brett = b;
        this.navn = navn;
    }

    public void run() {
        try {
            while (true) {
            	// 2-6 sekunder forsinkelse
                Thread.sleep(random.nextInt(4001) + 2000);
                brett.leggTilBurger(navn);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
