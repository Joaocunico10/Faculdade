package Lista01.Exercicio8;
/*Crie uma classe Usuario com login, senha e
tentativasFalhas.
• Método autenticar(senha): Se acertar, reseta
tentativas e retorna true.
• Se errar: Incrementa tentativasFalhas.
• Se atingir 3 falhas, o usuário é bloqueado (crie um
atributo boolean bloqueado) e não pode mais logar
mesmo com a senha certa. */

public class Usuario {
    protected String login;
    protected String senha;
    protected int tentativasFalhas;
    protected boolean bloqueado;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
        this.tentativasFalhas = 0;
        this.bloqueado = false;
    }

    public boolean autenticar(String senhaDigitada) {
        if (bloqueado) {
            System.out.println("Usuário bloqueado!");
            return false;
        }

        if (this.senha.equals(senhaDigitada)) {
            tentativasFalhas = 0;
            System.out.println("Login bem-sucedido!");
            return true;
        } else {
            tentativasFalhas++;
            System.out.println("Senha incorreta! Tentativas: " + tentativasFalhas);

            if (tentativasFalhas >= 3) {
                bloqueado = true;
                System.out.println("Usuário bloqueado por excesso de tentativas!");
            }

            return false;
        }
    }
}
