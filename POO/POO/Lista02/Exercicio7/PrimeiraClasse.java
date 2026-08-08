
public class PrimeiraClasse extends Passagem {
    public PrimeiraClasse(dobule precoBase){
        this.precoBase = precoBase;
    }

    @Override
    public double calcularPrecoFinal(){
        return precoBase * 2;
    }

}
