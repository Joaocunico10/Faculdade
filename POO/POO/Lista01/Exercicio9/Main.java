package Lista01.Exercicio9;

public class Main {
    public static void main(String[] args) {

        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        int valor1 = dado1.rolar();
        int valor2 = dado2.rolar();

        int soma = valor1 + valor2;

        System.out.println("Dado 1: " + valor1);
        System.out.println("Dado 2: " + valor2);
        System.out.println("Soma: " + soma);

        if (soma == 7 || soma == 11) {
            System.out.println("Você ganhou!");
        } else if (soma == 2 || soma == 3 || soma == 12) {
            System.out.println("Você perdeu!");
        } else {
            System.out.println("Tente de novo");
        }
    }
}
