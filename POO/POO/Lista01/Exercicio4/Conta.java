package Lista01.Exercicio4;
/*Crie a classe Conta com saldo e limite (privados).
• depositar(valor): Aumenta o saldo.
• sacar(valor): Só permite sacar se (saldo + limite) for
maior que o valor do saque.
• Ao final, exiba se a conta está usando o cheque
especial. */

public class Conta {
    private double saldo;
    private double limite;

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getLimite(){
        return limite;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (saldo + limite > valor) {
            System.out.println("Sacado!");
        }
        else{
            System.out.println("Usando cheque especial");
        }
    }

}
