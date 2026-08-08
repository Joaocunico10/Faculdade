
/*Crie um ArrayList com 5 nomes.
• Use Random para sortear um nome da lista.
• Exiba o nome sorteado. */
import java.util.ArrayList;
import java.util.Random;

public class Exercicio3_main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ligero");
        nomes.add("Moacir");
        nomes.add("Milico");
        nomes.add("Jao");
        nomes.add("Leio");

        Random gerador = new Random();

        int numero_aleatorio = gerador.nextInt(5);

        System.out.println("O numero sorteado foi: " + numero_aleatorio + " o nome sorteador foi " + nomes.get(numero_aleatorio));

    }

}