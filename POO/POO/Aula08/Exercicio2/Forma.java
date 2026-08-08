package Aula08.Exercicio2;
/*Crie a classe Forma apenas com atributos comuns
(ex.: cor, preenchida).
• Crie as subclasses Retangulo (largura, altura) e
Circulo (raio).
• Em cada subclasse, crie seu próprio método
calcularArea().
• No main, instancie Retangulo e Circulo e chame
calcularArea(). */ 

public class Forma {
    protected String cor;
    protected String preenchida;

    public void setCor(String cor){
        this.cor = cor;
    }

    public void  setPreenchida(String preenchida){
        this.preenchida = preenchida;
    }
}
