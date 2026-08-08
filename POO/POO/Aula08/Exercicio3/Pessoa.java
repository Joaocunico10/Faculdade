package Aula08.Exercicio3;
/*Crie a classe Pessoa com construtor que recebe nome.
• Crie a subclasse Aluno que recebe nome e matricula.
• Use super para chamar o construtor da superclasse.
• No main, instancie Aluno e exiba os dados. */

public class Pessoa {
    protected String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }
}
