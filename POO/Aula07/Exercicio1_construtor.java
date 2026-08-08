/*Crie a classe Produto com os atributos privados: nome
e preco.
• Implemente dois construtores:
– Um construtor vazio (sem parâmetros).
– Um construtor com dois parâmetros: nome e
preço.
• No construtor com parâmetros, valide que o preço
não pode ser negativo.
– Se o valor for negativo, defina o preço como 0.0 e */

class Produto {
    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        
        if (preco < 0) {
            preco = 0;
            System.out.println("Preco invalido");
        }
    }

}