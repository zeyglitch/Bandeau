import java.awt.Color;

import bandeau.Bandeau;
import exemple.ArcEnCiel;
import exemple.FlashFond;
import exemple.Rotation;
import exemple.Scenario;
import exemple.Teletype;
import exemple.Tremblement;
import exemple.Zoom;

public class MonScenario {
    public static void main(String[] args) {
        Bandeau b = new Bandeau();
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        
        Scenario s = new Scenario();
        
        b.setMessage("Bienvenue sur le TP"); 
        s.ajouterEffet(new Teletype(), 1);

        s.ajouterEffet(new Zoom(), 1);
        s.ajouterEffet(new Tremblement(), 1);

        s.ajouterEffet(new ArcEnCiel(), 1);
        s.ajouterEffet(new FlashFond(), 2);
        
        s.ajouterEffet(new Rotation(), 1);

        b.sleep(500);
        s.jouerSur(b);
        
        b.setMessage("Fin du spectacle !");
        b.sleep(3000);
        b.close();
    }
}