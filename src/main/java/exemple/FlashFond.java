package exemple;

import java.awt.Color;

import bandeau.Bandeau;

public class FlashFond extends Effet {
    @Override
    public void jouerSur(Bandeau b) {
        Color oldBack = b.getBackground();
        Color oldFore = b.getForeground();
        
        b.setMessage("Attention les yeux !");
        
        // On inverse les couleurs (Fond noir, texte blanc / Fond blanc, texte noir)
        for (int i = 0; i < 6; i++) {
            b.setBackground(Color.BLACK);
            b.setForeground(Color.WHITE);
            b.sleep(150);
            
            b.setBackground(Color.WHITE);
            b.setForeground(Color.BLACK);
            b.sleep(150);
        }
        
        // Restauration impérative
        b.setBackground(oldBack);
        b.setForeground(oldFore);
    }
}