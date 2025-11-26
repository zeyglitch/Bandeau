package exemple;

import java.awt.Color;

import bandeau.Bandeau;

public class ArcEnCiel extends Effet {
    @Override
    public void jouerSur(Bandeau b) {
        String oldMessage = b.getMessage();
        b.setMessage("Mode Disco !");
        
        Color oldColor = b.getForeground();
        // Tableau de couleurs à faire défiler
        Color[] couleurs = {
            Color.RED, Color.ORANGE, Color.YELLOW, 
            Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA
        };
        
        // On fait 4 cycles complets de couleurs
        for (int cycle = 0; cycle < 4; cycle++) {
            for (Color c : couleurs) {
                b.setForeground(c);
                b.sleep(100);
            }
        }
        
        // Restauration
        b.setForeground(oldColor);
        b.setMessage(oldMessage);
    }
}