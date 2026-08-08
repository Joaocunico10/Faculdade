package Lista01.Exercicio8;

public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario("admin", "1234");

        user.autenticar("1111");
        user.autenticar("2222");
        user.autenticar("3333");

        user.autenticar("1234");
    }
}