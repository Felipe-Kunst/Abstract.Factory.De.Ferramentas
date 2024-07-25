package Ferramentas;

public class Enxada implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando enxada...");
    }

    @Override
    public Ferramenta criar() {
        return new Enxada();
    }
}
