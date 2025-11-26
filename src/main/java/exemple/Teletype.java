package exemple;

import bandeau.Bandeau;

public class Teletype extends Effet {
    @Override
    public void jouerSur(Bandeau b) {
        String messageOriginal = b.getMessage();
        // On vide le message pour commencer
        b.setMessage("");
        
        // On affiche les caractères un par un
        for (int i = 0; i < messageOriginal.length(); i++) {
            // On prend la sous-chaîne de 0 à i+1
            b.setMessage(messageOriginal.substring(0, i + 1));
            b.sleep(100); // Vitesse de frappe
        }
        
        // Pause à la fin pour lire
        b.sleep(500);
    }
}