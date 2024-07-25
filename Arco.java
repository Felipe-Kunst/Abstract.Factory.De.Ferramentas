package Ferramentas;

public class Arco implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando arco...");
    }

    @Override
    public Ferramenta criar() {
        return new Arco();
    }
}
