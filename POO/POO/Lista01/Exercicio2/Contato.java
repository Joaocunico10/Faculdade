/*Crie uma classe Contato com atributos nome e telefone.
• Use encapsulamento (private) e Crie Getters e
Setters.
• Validação no Setter do telefone: o número deve ter
pelo menos 8 dígitos, caso contrário, não salve e
imprima "Número inválido". */

package Lista01.Exercicio2;

class Contato {
    private String nome;
    private String telefone;
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(String telefone){
        if (telefone.length() >= 8) {
            this.telefone = telefone;
        }
        else{
            System.out.println("Telefone invalido!!");
        }
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }
    
}