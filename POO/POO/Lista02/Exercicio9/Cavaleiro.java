package Exercicio9

public class Cavaleiro extends Unidade {
    @Override
    public void mover(){
        System.out.println("O cavaleiro se move 3 casas");
    }

    @Override
    public void atacar(){
        System.out.println("Ataca corpo a corpo");
    }
}