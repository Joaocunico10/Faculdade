/*Crie uma classe Musica com titulo, artista e duracao
(em segundos).
• Crie um construtor que obrigue a passar os 3 dados.
• Crie um método getDuracaoFormatada() que
retorne uma String no formato "MM:SS" (Ex: 230 seg
= "03:50"). */

public class Musica {
    protected String musica;
    protected String artista;
    protected double duracao;

    public Musica(String musica, String artista, double duracao) {
        this.musica = musica;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getDuracaoFormatada() {
        int minutos = (int) duracao / 60;
        int segundos = (int) duracao % 60;

        return String.format("%02d:%02d", minutos, segundos);
    }
}