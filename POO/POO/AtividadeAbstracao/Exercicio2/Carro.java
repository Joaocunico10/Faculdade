package AtividadeAbstracao.Exercicio2;

class Carro extends Veiculo {
    Carro(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    void acelerar(){
        System.out.println("Acelerando veiculo");
    }
}
