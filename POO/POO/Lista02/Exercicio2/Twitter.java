package Exercicio2;

public class Twitter extends RedeSocial {
    @Override
    public void postar(String mensagem){
        if (mensagem.length() <= 280){
            System.out.println("Tweetou " + mensagem);
        }
        else{
            System.out.println("Texto muito longo");
        }
    }
}
