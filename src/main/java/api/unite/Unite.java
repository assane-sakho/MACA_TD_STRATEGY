package api.unite;

import api.attaque.Attaque;
import api.deplacement.Deplacement;

public class Unite {
    private Attaque attaque;
    private Deplacement deplacement;

    public Unite(Attaque uneAttaque, Deplacement deplacement) {
        setAttaqueStrategy(uneAttaque);
        setDeplacementStrategy(deplacement);
    }

    public void seDeplacer() {
        deplacement.deplacer();
    }

    public void combattre() {
        attaque.attaquer();
    }

    public void setAttaqueStrategy(Attaque uneAttaque) {
        this.attaque = uneAttaque;
    }

    public void setDeplacementStrategy(Deplacement deplacement) {
        this.deplacement = deplacement;
    }
}