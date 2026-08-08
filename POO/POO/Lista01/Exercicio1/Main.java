package Lista01.Exercicio1;
/*Crie uma classe Lampada com:
• Atributo: ligada (boolean) e potencia (int).
• Métodos: ligar(), desligar() e meiaLuz().
• No main, teste o estado da lâmpada após chamar os
métodos. */

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada(20);

        lampada.mostrarEstado();

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.meialuz();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();
    }
}
