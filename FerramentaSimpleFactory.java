package Ferramentas;

public class FerramentaSimpleFactory implements FerramentaFactory {
    @Override
    public Martelo criarMartelo() {
        return new Martelo();
    }
    @Override
    public Foice criarFoice() {
        return new Foice();
    }
    @Override
    public Picareta criarPicareta() {
        return new Picareta();
    }
    @Override
    public Serrote criarSerrote() {
        return new Serrote();
    }
}
