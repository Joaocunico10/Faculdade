package Lista01.Exercicio7;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(200); // limite de 200kg

        elevador.entrar(65);
        elevador.entrar(60);
        elevador.entrar(55);

        elevador.sair(50);
    }
}