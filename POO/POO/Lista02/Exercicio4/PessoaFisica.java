package Exercicio4;

public class PessoaFisica extends Contribuinte {
    @Override
    public double calcularImposto() {
        return rendaBruta * 0.15;
    }
}
