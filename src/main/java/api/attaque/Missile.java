package api.attaque;

public class Missile implements Attaque{
    @Override
    public void attaquer() {
        System.out.println("Je suis un missile et j'attaque...");
    }
}
