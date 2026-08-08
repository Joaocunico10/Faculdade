package AtividadeAbstracao.Exercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        listaFuncionarios.add(new Gerente("Joao", 10000));
        listaFuncionarios.add(new Vendedor("Alex", 2500));
        listaFuncionarios.add(new Vendedor("Luis", 2599));

        for (Funcionario funcionario : listaFuncionarios) {
            funcionario.calcularBonus();
            System.out.println("");
        }
    }
}
