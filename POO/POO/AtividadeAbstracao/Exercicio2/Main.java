package AtividadeAbstracao.Exercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        
        listaVeiculos.add(new Carro("Mercedez", "c300"));
        listaVeiculos.add(new Moto("Honda", "Biz"));

        for (Veiculo veiculo : listaVeiculos) {
            veiculo.acelerar();
            veiculo.exibirDados();
            System.out.println("");
        }

    }
}
