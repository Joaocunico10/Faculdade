package Interfaces.Exercicio1;

public class Circulo implements FormaGeometrica {
    double PI = 3.14;
    public double raio;
    public double resultado;

    @Override
    public void calcularArea() {
        resultado = PI * (raio * raio);
        System.out.println("O resultado da area do circulo e: " + PI + " * (" + raio + " * " + raio + ") ");
        System.out.println("Ficando...");
        System.out.println("Resultado: " + resultado);
    }

}
