package Aula08.Exercicio2;

public class Circulo extends Forma {
    protected double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return 3.14 * raio * raio;
    }
}