package Ferramentas;

public class Faca implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando faca...");
    }

    @Override
    public Ferramenta criar() {
        return new Faca();
    }
}
