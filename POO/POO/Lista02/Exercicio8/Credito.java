public class Credito extends MetodoPagamento {
    public Credito(double valor){
        this.valor = valor;
    }

    @Override
    public void processar(double valor){
        System.out.println("Cobrando R$ " + valor + " no cartão... Taxa de 5%");
    }
}
