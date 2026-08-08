public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Musica boa", "Robertinho", 120);

        System.out.println("O nome da muscia e: " + musica1.musica);
        System.out.println("O artista da musica e: " + musica1.artista);
        System.out.println("Duracao da musica " + musica1.getDuracaoFormatada());
    }
}
