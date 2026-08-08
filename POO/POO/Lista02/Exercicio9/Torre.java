package Exercicio9;

public class Torre extends Unidade {
    @Override
    public void mover(){
        System.out.println("Nao se move");
    }

    @Override
    public void atacar(){
        System.out.println("Ataca com canhao");
    }
}
