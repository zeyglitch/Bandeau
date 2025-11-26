package exemple;

import java.awt.Color;

import bandeau.Bandeau;

public class Clignotant extends Effet {
    @Override
    public void jouerSur(Bandeau b) {
        String oldMessage = b.getMessage();
        b.setMessage("Je clignote !");
        Color oldColor = b.getForeground();
        
        for (int i = 0; i < 3; i++) {
            b.setForeground(Color.RED);
            b.sleep(100);
            b.setForeground(Color.BLACK);
            b.sleep(100);
        }
        
        b.setForeground(oldColor);
        b.setMessage(oldMessage);
    }
}