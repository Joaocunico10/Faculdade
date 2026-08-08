package Lista01.Exercicio3;

public class Main {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();

        termometro.setTemp(15);
        //termometro.AumentarTemp(5);
        termometro.DiminuirTemp(10);

        System.out.println("A temperatura atual e: " + termometro.temperaturaAtual);
        System.out.println("Em fahrenheit: " + termometro.exibirFahrenheit());
    }
}
