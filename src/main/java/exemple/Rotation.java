package exemple;

import bandeau.Bandeau;

public class Rotation extends Effet {
    @Override
    public void jouerSur(Bandeau b) {
        String oldMessage = b.getMessage();
        b.setMessage("Je tourne !");
    
        for (int i = 0; i <= 100; i++) {
            b.setRotation(2 * Math.PI * (i / 100.0));
            b.sleep(10);
        }
        
        b.setRotation(0.0);
        b.setMessage(oldMessage);
    }
}