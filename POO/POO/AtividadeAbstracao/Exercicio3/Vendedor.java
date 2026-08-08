package AtividadeAbstracao.Exercicio3;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void calcularBonus(){
        System.out.println("O funcionario e: " + nome + " e seu salario e: " + salario + ". O bonus e: " + salario * 0.3);
        System.out.println("Ficando o salario no total de: " + (salario + (salario * 0.3)));
    }
}
