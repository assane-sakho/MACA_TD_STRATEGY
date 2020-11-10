package api.attaque;

public class Mitraillette implements Attaque{
    @Override
    public void attaquer() {
        System.out.println("Je suis une mitraillette et j'attaque en tirant des balles.");
    }
}
