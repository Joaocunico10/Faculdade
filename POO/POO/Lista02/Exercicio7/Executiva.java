

public class Executiva extends Passagem {
    public Executiva(double precoBase){
        this.precoBase = precoBase;
    } 

    @Override
    public double calcularPrecoFinal(){
        return precoBase + (precoBase * 0.5);
    }
}
