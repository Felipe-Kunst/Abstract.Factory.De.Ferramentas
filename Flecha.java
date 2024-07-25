package Ferramentas;

public class Flecha implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando flecha...");
    }

    @Override
    public Ferramenta criar() {
        return new Flecha();
    }
}
