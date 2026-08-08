package Lista01.Exercicio5;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Roda", 100, 200, 20);

        System.out.println("O lucro presumido e: " + produto1.lucroPresumido());
        System.out.println(produto1.vende());
        
    }
}
