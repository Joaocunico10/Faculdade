package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Instrumento instrumento1 = new Violao();
        Instrumento instrumento2 = new Bateria();
        
        instrumento1.tocar();
        instrumento2.tocar();
    }
}
