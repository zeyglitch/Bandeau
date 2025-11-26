package exemple;

import java.util.Random;

import bandeau.Bandeau;

public class Tremblement extends Effet {
    @Override
    public void jouerSur(Bandeau b) {
        String oldMsg = b.getMessage();
        b.setMessage("TREMBLEMENT !!!");
        Random rand = new Random();
        
        for (int i = 0; i < 20; i++) {

            double angle = (rand.nextDouble() - 0.5) * 0.2; 
            b.setRotation(angle);
            b.sleep(50);
        }
        
        b.setRotation(0.0);
        b.setMessage(oldMsg);
    }
}