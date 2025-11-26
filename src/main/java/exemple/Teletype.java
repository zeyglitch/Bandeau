package exemple;

import bandeau.Bandeau;

public class Teletype extends Effet {
    @Override
    public void jouerSur(Bandeau b) {
        String messageOriginal = b.getMessage();

        b.setMessage("");

        for (int i = 0; i < messageOriginal.length(); i++) {

            b.setMessage(messageOriginal.substring(0, i + 1));
            b.sleep(100);
        }
        
        b.sleep(500);
    }
}