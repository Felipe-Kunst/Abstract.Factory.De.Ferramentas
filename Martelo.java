package Ferramentas;

public class Martelo implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando martelo...");
    }

    @Override
    public Ferramenta criar() {
        return new Faca();
    }
}
