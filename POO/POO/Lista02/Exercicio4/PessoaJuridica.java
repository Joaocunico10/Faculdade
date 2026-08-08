package Exercicio4;

public class PessoaJuridica extends Contribuinte {
    @Override
    public double calcularImposto(){
        return rendaBruta * 0.10;
    }
}
