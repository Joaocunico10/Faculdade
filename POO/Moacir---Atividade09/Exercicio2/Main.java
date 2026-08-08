package Exercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();

        lista.add(new Veiculo());
        lista.add(new Carro());
        lista.add(new Bicicleta());

        for (Veiculo veiculo : lista) {
            veiculo.mover();
        }
    }
}
