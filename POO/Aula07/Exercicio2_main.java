import java.util.Scanner;

public class Exercicio2_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Ola " + nome + " , sua idade e " + idade + " anos");

        Execicio2_Pessoa pessoa = new Execicio2_Pessoa(nome, idade);

    }
}
