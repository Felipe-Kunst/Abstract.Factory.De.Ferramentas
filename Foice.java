package Ferramentas;

public class Foice implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando foice...");
    }

    @Override
    public Ferramenta criar() {
        return new Arco();
    }
}
