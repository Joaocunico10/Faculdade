/*Crie uma classe Item com nome e preco.
• Sobrescreva o toString para retornar: "Item: [nome] |
R$ [preco]".
• No Main, crie uma lista de itens (mercado) e use um
foreach imprimindo o objeto diretamente. */

public class Item {

    String nome;
    double preco;

    @Override
    public String toString() {
        return "Item: " + nome + " | R$ " + preco;
    }
}
