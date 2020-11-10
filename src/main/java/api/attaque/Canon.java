package api.attaque;

public class Canon implements Attaque{
    @Override
    public void attaquer() {
        System.out.println("Je suis un canon et j'attaque en projetant des boulets.");
    }
}
