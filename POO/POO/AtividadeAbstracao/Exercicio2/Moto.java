package AtividadeAbstracao.Exercicio2;

public class Moto extends Veiculo{
    Moto(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    void acelerar(){
        System.out.println("VranDanDanDanVran");
    }
}
