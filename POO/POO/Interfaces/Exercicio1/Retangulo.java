package Interfaces.Exercicio1;

public class Retangulo implements FormaGeometrica {
    double resultado;
    double altura;
    double base;

    @Override
    public void calcularArea(){
        resultado = altura * base;
        System.out.println("O resultado da area do retangulo e: " + altura + " x " + base);
        System.out.println("Ficando...");
        System.out.println("Resultado: " + resultado);
    } 

}
