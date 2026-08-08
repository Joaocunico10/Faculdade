/*Crie a classe Pessoa com atributos nome e idade.
• No main, use o Scanner para ler esses dados do
teclado.
• Instancie um objeto da classe Pessoa com os dados
lidos. */

class Execicio2_Pessoa {
    String nome;
    int idade;

    public Execicio2_Pessoa() {
        System.out.println("Nada digitado! ");
    }

    public Execicio2_Pessoa(String nome) {
        this.nome = nome;
    }

    public Execicio2_Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
