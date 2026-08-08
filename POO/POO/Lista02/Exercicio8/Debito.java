public class Debito extends MetodoPagamento {
    public Debito(double valor){
        this.valor = valor;
    }

    @Override
    public void processar(double valor){
        System.out.println("Cobrando R$ " + valor + " no debito... Sem taxa");
    }
}
