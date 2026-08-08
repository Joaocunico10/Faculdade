package Aula08.Exercicio2;

public class Retangulo extends Forma {
    protected int altura;
    protected int largura;

    public Retangulo(int largura, int altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea(){
        return largura * altura;
    }
}