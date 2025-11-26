package exemple;

import bandeau.Bandeau;

public abstract class Effet {
    /**
     * Applique l'effet sur le bandeau.
     * @param b Le bandeau cible
     */
    public abstract void jouerSur(Bandeau b);
}