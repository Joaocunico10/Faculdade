package Interfaces.Exercicio2;

public class senha implements Autenticavel {
    @Override
    public void Autenticar(boolean senha){
        if (senha == true) {
            System.out.println("Autencicado com sucesso!");
        }
        else{
            System.out.println("Nao autenticado");
        }
    }
}
