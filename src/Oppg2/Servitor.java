package Oppg2;

import java.util.Random;

public class Servitor extends Thread {
	
    private HamburgerBrett brett;
    private String navn;
    private Random random = new Random();

    public Servitor(HamburgerBrett b, String navn) {
        this.brett = b;
        this.navn = navn;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(4001) + 2000); // 2–6 sek
                brett.taBurger(navn);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
