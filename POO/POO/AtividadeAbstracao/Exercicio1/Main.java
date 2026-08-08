package AtividadeAbstracao.Exercicio1;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Animal> lista = new ArrayList<>();

        lista.add(new Cachorro("Ted"));
        lista.add(new Gato("Scooby"));

        for (Animal a : lista)
            a.emitirSom();
    }
}