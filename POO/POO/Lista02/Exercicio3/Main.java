package Exercicio3;

public class Main {
    public static void main(String[] args) {
        Operacao operacao1 = new Soma();
        Operacao operacao2 = new Divisao();
        Operacao operacao3 = new Multiplicacao();

        System.out.println(operacao1.executar(10, 5));
        System.out.println(operacao2.executar(10, 5));
        System.out.println(operacao3.executar(10, 5));
        
    }
}
