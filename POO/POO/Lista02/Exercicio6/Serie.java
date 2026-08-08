package Exercicio6;

public class Serie extends Conteudo {
    int qtdEpisodios;

    public Serie(String titulo, int qtdEpisodios) {
        this.titulo = titulo;
        this.qtdEpisodios = qtdEpisodios;
    }

    @Override
    public double getPreco() {
        return 2.0 * qtdEpisodios;
    }
}
