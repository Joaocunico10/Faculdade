package Lista01.Exercicio3;
/*Crie uma classe Termometro com atributo
temperaturaAtual (double).
• Crie um método aumentarTemp(double valor) e
diminuirTemp(double valor).
• Crie um método exibirFahrenheit() que retorna a
temperatura convertida (T × 1.8 + 32). */

public class Termometro {
    protected double temperaturaAtual;

    public void setTemp(double temperaturaAtual){
        this.temperaturaAtual = temperaturaAtual;
    }

    public void AumentarTemp(double valor){

        this.temperaturaAtual += valor;
    }

    public void DiminuirTemp(double valor){
        this.temperaturaAtual -= valor;
    }

    public double exibirFahrenheit(){
        return (temperaturaAtual * 1.8) + 32;
    }
}
