package exemple;

import java.util.ArrayList;
import java.util.List;

import bandeau.Bandeau;

public class Scenario {

    private static class Etape {
        Effet effet;
        int repetitions;

        public Etape(Effet effet, int repetitions) {
            this.effet = effet;
            this.repetitions = repetitions;
        }
    }

    private final List<Etape> etapes = new ArrayList<>();

    /**
     * Ajoute un effet au scénario.
     * @param e L'effet à ajouter
     * @param repetitions Nombre de répétitions de l'effet
     */
    public void ajouterEffet(Effet e, int repetitions) {
        if (repetitions > 0) {
            etapes.add(new Etape(e, repetitions));
        }
    }

    /**
     * Joue le scénario complet sur le bandeau.
     * @param b Le bandeau cible
     */
    public void jouerSur(Bandeau b) {
        for (Etape etape : etapes) {
            for (int i = 0; i < etape.repetitions; i++) {
                etape.effet.jouerSur(b);
            }
        }
    }
}