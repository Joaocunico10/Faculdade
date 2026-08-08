package Exercicio4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contribuinte> lista = new ArrayList<>();

        PessoaFisica pf = new PessoaFisica();
        pf.rendaBruta = 2000;

        PessoaJuridica pj = new PessoaJuridica();
        pj.rendaBruta = 5000;

        lista.add(pf);
        lista.add(pj);

        double totalImposto = 0;

        for (Contribuinte c : lista) {
            totalImposto += c.calcularImposto();
        }

        System.out.println("Total de imposto: " + totalImposto);
    }
}
