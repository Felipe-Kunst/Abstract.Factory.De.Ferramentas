package Ferramentas;

public class Main {
    public static void main(String[] args) {
        FerramentaFactory factory = new FerramentaSimpleFactory();
        Martelo martelo = factory.criarMartelo();
        Foice foice = factory.criarFoice();
        Picareta picareta = factory.criarPicareta();
        Serrote serrote = factory.criarSerrote();
        
        martelo.usar();
        foice.usar();
        picareta.usar();
        serrote.usar();
        
        Ferramenta novaFerramenta1 = martelo.criar();
        System.out.println("Faca Criada.");
        Ferramenta novaFerramenta2 = picareta.criar();
        System.out.println("Enxada Criada.");
        Ferramenta novaFerramenta3 = foice.criar();
        System.out.println("Arco Criado.");
        Ferramenta novaFerramenta4 = serrote.criar();
        System.out.println("Flecha Criada.");   
        
        novaFerramenta1.usar();
        novaFerramenta2.usar();
        novaFerramenta3.usar();
        novaFerramenta4.usar();
    }
}
