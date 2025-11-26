package exemple;

import java.awt.Color;

import bandeau.Bandeau;

public class ArcEnCiel extends Effet {
    @Override
    public void jouerSur(Bandeau b) {
        String oldMessage = b.getMessage();
        b.setMessage("Mode Disco !");
        
        Color oldColor = b.getForeground();

        Color[] couleurs = {
            Color.RED, Color.ORANGE, Color.YELLOW, 
            Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA
        };
        
        for (int cycle = 0; cycle < 4; cycle++) {
            for (Color c : couleurs) {
                b.setForeground(c);
                b.sleep(100);
            }
        }
        
        b.setForeground(oldColor);
        b.setMessage(oldMessage);
    }
}