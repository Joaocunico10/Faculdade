public class Criptomoeda extends MetodoPagamento {
    public Criptomoeda(double valor){
        this. valor = valor;
    }

    @Override
    public void processar(double valor){
        System.out.println("Convertendo R$ " + valor + " para Bitconin...");
    }
}
