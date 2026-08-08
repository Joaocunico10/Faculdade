package Exercicio2;

public class Instragram extends RedeSocial {
    @Override
    public void postar(String mensagem){
        System.out.println("Postou foto no feed: " + mensagem);
    }
}
