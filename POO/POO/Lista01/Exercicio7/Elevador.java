package Lista01.Exercicio7;
/*Crie uma classe Elevador com:
• Atributos: andarAtual, pesoAtual, pesoMaximo.
• Métodos: entrar(double pesoPessoa), sair(double
pesoPessoa).
• Valide: O elevador não pode subir se pesoAtual >
pesoMaximo. Imprima um alerta de sobrecarga. */

public class Elevador {
    protected int andarAtual;
    protected double pesoAtual;
    protected double pesoMaximo;

    public Elevador(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
        this.pesoAtual = 0;
    }

    public void entrar(double pesoPessoa) {
        if (pesoAtual + pesoPessoa <= pesoMaximo) {
            pesoAtual += pesoPessoa;
            System.out.println("Pessoa entrou. Peso atual: " + pesoAtual);
        } else {
            System.out.println("Sobrecarga!");
        }
    }

    public void sair(double pesoPessoa) {
        pesoAtual -= pesoPessoa;

        if (pesoAtual < 0) {
            pesoAtual = 0;
        }

        System.out.println("Pessoa saiu. Peso atual: " + pesoAtual);
    }
}
