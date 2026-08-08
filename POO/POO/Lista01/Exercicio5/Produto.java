package Lista01.Exercicio5;
/*Crie a classe Produto com nome, precoCusto,
precoVenda e qtdEstoque.
• Método lucroPresumido(): Retorna (preço venda -
preço custo) * estoque.
• Método vender(int qtd): Só vende se tiver estoque.
Se tentar vender mais do que tem, exiba "Estoque
insuficiente". */

public class Produto {
    protected String nome;
    protected int precoCusto;
    protected int precoVenda;
    protected int qtdEstoque;

    public Produto(String nome, int precoCusto, int precoVenda, int qtdEstoque){
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.qtdEstoque = qtdEstoque;
    }

    public double lucroPresumido(){
        return (precoVenda - precoCusto) * qtdEstoque;
    }

    public int vende(int qtd){
        if (qtd <= qtdEstoque) {
            System.out.println("venda feita!");
        }
        else{
            System.out.println("Venda nao feita!");
        }
    }
}
