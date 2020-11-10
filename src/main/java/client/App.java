package client;

import api.attaque.*;
import api.deplacement.*;
import api.unite.Unite;

import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {
        Mitraillette mitraillette = new Mitraillette();
        LanceFlamme lanceFlamme = new LanceFlamme();
        Canon canon = new Canon();
        Attaque missile = new Missile();

        Courir courir = new Courir();
        Rouler rouler = new Rouler();
        Voler voler = new Voler();

        Unite soldatSolMitraillette = new Unite(mitraillette, courir);
        Unite soldatAirLanceFlamme = new Unite(lanceFlamme, voler);
        Unite soldatVoitureCanon = new Unite(canon, rouler);
        Unite soldatAirMissile = new Unite(missile, voler);

        List<Unite> unites = Arrays.asList(
                soldatSolMitraillette,
                soldatAirLanceFlamme,
                soldatVoitureCanon,
                soldatAirMissile
        );

        afficher(unites);

        soldatSolMitraillette.setAttaqueStrategy(canon);
        soldatAirLanceFlamme.setDeplacementStrategy(rouler);
        soldatVoitureCanon.setDeplacementStrategy(courir);
        soldatAirMissile.setAttaqueStrategy(mitraillette);


        System.out.println("_______ Changement de strategy : _____________");

        afficher(unites);
    }

    public static void afficher(List<Unite> unites)
    {
        unites.forEach(unite -> {
            System.out.printf("Attaque : ");
            unite.combattre();

            System.out.printf("Déplacement : ");
            unite.seDeplacer();
            System.out.println("\n\n");
        });
    }
}
