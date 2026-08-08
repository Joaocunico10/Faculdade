package Lista01.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato();

        contato1.setNome("Joao");

        contato1.setTelefone("42999576785");
        System.out.println(contato1.getTelefone());

        System.out.println(contato1.getNome());
    }
}
