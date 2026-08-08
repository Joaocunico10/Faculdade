package Lista01.Exercicio4;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.setSaldo(2000);
        conta1.setLimite(4000);
        conta1.depositar(500);
        conta1.sacar(8000);

        System.out.println("Seu saldo e: " + conta1.getSaldo());
        

    }
}
