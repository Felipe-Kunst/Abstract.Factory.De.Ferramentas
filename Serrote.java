package Ferramentas;

public class Serrote implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando serrote...");
    }

    @Override
    public Ferramenta criar() {
        return new Flecha();
    }
}
