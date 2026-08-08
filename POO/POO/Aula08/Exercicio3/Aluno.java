package Aula08.Exercicio3;

public class Aluno extends Pessoa {
    protected int matricula;

    public Aluno(String nome, int matricula){
        super(nome);
        this.matricula = matricula;
    }
}
