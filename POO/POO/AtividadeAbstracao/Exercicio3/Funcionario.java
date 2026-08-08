/*Criar classe abstrata Funcionario com:
– Atributos: nome, salário.
– Método abstrato calcularBonus().
• Criar subclasses Gerente e Vendedor.
• Criar lista de funcionários e imprimir os bônus. */

package AtividadeAbstracao.Exercicio3;

abstract class Funcionario{
    String nome;
    double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void calcularBonus();
}