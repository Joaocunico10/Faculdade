/*Criar classe Produto com nome, preço e quantidade.
• Sobrescrever toString() para mostrar "Produto:
Nome (Qnt) - Preço".
• Criar lista de produtos e imprimir. */

package Exercicio3;

class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + ". Preco: " + preco + ". Quantidade: " + quantidade;
    }
    
}