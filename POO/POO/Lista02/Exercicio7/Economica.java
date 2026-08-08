

public class Economica extends Passagem {

    public Economica(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + (precoBase * 0.1);
    }
}