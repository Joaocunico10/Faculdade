package Exercicio10;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Arquivo> lista = new ArrayList<>();

        lista.add(new Imagem());
        lista.add(new Texto());
        lista.add(new Video());

        for (Arquivo a : lista) {
            a.abrir();
        }
    }
}
