package Ferramentas;

public class Picareta implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando picareta...");
    }

    @Override
    public Ferramenta criar() {
        return new Enxada();
    }
}


