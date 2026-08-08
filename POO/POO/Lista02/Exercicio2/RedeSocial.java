/*Crie uma classe RedeSocial com atributo usuario e
método postar(String mensagem).
• Subclasse Instagram: Imprime "Postou foto no feed:
[mensagem]".
• Subclasse Twitter: Verifica se a mensagem tem ≤
280 caracteres. Se sim, "Tweetou: [mensagem]". Se
não, "Texto muito longo". */

package Exercicio2;

public class RedeSocial {
    
    String usuario;

    public void postar(String mensagem){
        System.out.println("Postando algo...");
    }


}
