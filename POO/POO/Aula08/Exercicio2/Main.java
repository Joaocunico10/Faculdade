package Aula08.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(12, 10);
        Circulo circulo1 = new Circulo(10);

        System.out.println("Area do retangulo: " + retangulo1.calcularArea());
        System.out.println("Area do circulo: " + circulo1.calcularArea());
    }
}
