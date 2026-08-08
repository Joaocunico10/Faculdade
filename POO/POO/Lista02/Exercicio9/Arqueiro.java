package Exercicio9;

public class Arqueiro extends Unidade {
    @Override
    public void  mover(){
        System.out.println("O arqueiro se move 1 casa");
    }

    @Override
    public void atacar(){
        System.out.println("Ataca a distancia");
    }
}
