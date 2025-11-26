package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class Zoom extends Effet {
    @Override
    public void jouerSur(Bandeau b) {
        String oldMessage = b.getMessage();
        b.setMessage("Je zoome !");
        
        Font oldFont = b.getFont();
        int oldSize = oldFont.getSize();

        for (int i = 0; i < 50; i += 5) {
            b.setFont(new Font(oldFont.getName(), Font.BOLD, oldSize + i));
            b.sleep(50);
        }

        b.setFont(oldFont);
        b.setMessage(oldMessage);
    }
}